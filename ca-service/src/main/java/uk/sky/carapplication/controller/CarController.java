package uk.sky.carapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.sky.carapplication.model.Car;
import uk.sky.carapplication.model.CreateCarResponse;
import uk.sky.carapplication.repository.CarRepository;
import uk.sky.carapplication.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(path = "/create")
    public ResponseEntity<CreateCarResponse> createCar(@RequestBody Car car){
        CreateCarResponse response = carService.responseForAddingCarToDatabase(car);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<String> status(){
        return new ResponseEntity<>("OK",  HttpStatus.OK);
    }
}
