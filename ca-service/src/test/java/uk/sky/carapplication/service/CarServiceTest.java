package uk.sky.carapplication.service;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.sky.carapplication.controller.CarController;
import uk.sky.carapplication.model.Car;
import uk.sky.carapplication.repository.CarRepository;
import uk.sky.carapplication.service.CarService;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.matches;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {



    @InjectMocks
    CarService carService;

    @Mock
    CarRepository carRepository;

    @Test
    public void testThatBodyIsCorrect(){
        Car testCar = new Car(1, "BMW", "Series 3", "black", 2010, 15000);
        //doCallRealMethod().when(carService).responseForAddingCarToDatabase(Mockito.any(Car.class));
        assertTrue(carService.responseForAddingCarToDatabase(testCar).getMessage().matches("Car added successfully"));
    }

    @Test
    public void testStatusCodeIsSuccessful() {
        Car testCar = new Car(1, "BMW", "Series 3", "black", 2010, 15000);
        assertTrue(carService.responseForAddingCarToDatabase(testCar).getStatus().is2xxSuccessful());
    }

    @Test
    public void testCarAddedToDB() {
        Car testCar = new Car(1, "BMW", "Series 3", "black", 2010, 15000);
        when(carRepository.save(Mockito.any(Car.class))).thenAnswer(car -> car.getArguments()[0]);
        carService.responseForAddingCarToDatabase(testCar);
    }
}

//@ExtendWith(MockitoExtension.class)
//@RunWith(SpringRunner.class)
//@DataJpaTest
//public class CarControllerTest {
//    @Test
//    public void testStatusCodeIsSuccessful() {
//        assertTrue(carService.addCar(car));
//    }

//    @Test
//    public void testCarHasBeenAdded() {
//        when(carRepository).save(Mockito.any(Car.class)).thenAnswer( car -> {
//            return car.getArguments()[0];
//        });
//    }

