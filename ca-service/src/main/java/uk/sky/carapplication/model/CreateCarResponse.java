package uk.sky.carapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class CreateCarResponse {

    private HttpStatus status;
    private String message;
    private Car car;

}
