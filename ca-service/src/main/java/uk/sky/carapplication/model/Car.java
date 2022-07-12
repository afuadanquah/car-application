package uk.sky.carapplication.model;

import lombok.*;

@RequiredArgsConstructor

public class Car {

    private final String brand;
    private final String model;
    private final int year;
    private int mileage;


}
