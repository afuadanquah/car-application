package uk.sky.carapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.sky.carapplication.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
