package uk.sky.carapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Car {

    private int id;
    private String brand;
    private String model;
    private String colour;
    private int year;
    private double price;


}
