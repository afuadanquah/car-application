package uk.sky.carapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uk.sky.carapplication.model.Car;
import uk.sky.carapplication.model.CreateCarResponse;
import uk.sky.carapplication.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

//    public CarService (CarRepository carRepository) {
//        this.carRepository = carRepository;
//    }

    List<Car> listOfCars = new ArrayList<>();

    public CreateCarResponse responseForAddingCarToDatabase(Car car){
        CreateCarResponse response = new CreateCarResponse(HttpStatus.OK, "Car added successfully", car);
        carRepository.save(car);
        listOfCars.add(car);
        return response;
    }


}
