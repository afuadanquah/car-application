package uk.sky.carapplication.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import uk.sky.carapplication.model.Car;
import uk.sky.carapplication.model.CarCreateResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    List<Car> listOfCars = new ArrayList<>();

    public CarCreateResponse addCar(Car car){
        CarCreateResponse response = new CarCreateResponse(HttpStatus.OK, "Car added successfully", car);
        listOfCars.add(car);
        return response;
    }
}
