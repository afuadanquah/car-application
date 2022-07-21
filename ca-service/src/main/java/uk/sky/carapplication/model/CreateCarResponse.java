package uk.sky.carapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@Getter
public class CreateCarResponse {

    private HttpStatus status;
    private String message;
    private Car car;

}
