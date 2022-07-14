package uk.sky.carapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

//@AllArgsConstructor
//@DynamicUpdate
@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String colour;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private double price;


}
