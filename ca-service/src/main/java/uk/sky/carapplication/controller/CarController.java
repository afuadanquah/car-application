package uk.sky.carapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.sky.carapplication.model.Car;
import uk.sky.carapplication.model.CreateCarResponse;
import uk.sky.carapplication.repository.CarRepository;
import uk.sky.carapplication.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    @Autowired CarRepository carRepo;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(path = "/create")
    public ResponseEntity<CreateCarResponse> createCar(@RequestBody Car car){
        CreateCarResponse response = carService.addCar(car);
        carRepo.save(car);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
