package uk.sky.carapplication.controller;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
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
public class CarControllerTest {

    @InjectMocks
    CarController carController;

    @Mock
    CarService carService;
}
