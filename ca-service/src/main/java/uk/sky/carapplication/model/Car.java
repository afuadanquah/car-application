package uk.sky.carapplication.model;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

//@DynamicUpdate
@Entity
@Table
//@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString
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
    private Integer yearMade;
    @Column(nullable = false)
    private double price;


}
