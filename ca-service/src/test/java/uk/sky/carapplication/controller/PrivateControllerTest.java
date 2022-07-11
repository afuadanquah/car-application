package uk.sky.carapplication.controller;

import org.apache.hc.core5.http.HttpStatus;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class PrivateControllerTest {

    @Test
    public void statusCodeIsCorrect(){
    PrivateController privateController = new PrivateController();
    assertTrue(privateController.status().getStatusCode().is2xxSuccessful());

    }

    @ParameterizedTest
    @ValueSource(ints = {HttpStatus.SC_BAD_REQUEST})
    public void statusCodeIsIncorrect(HttpStatus httpStatus){
    PrivateController privateController = new PrivateController();;

    assertEquals(privateController.status().getStatusCode().value(), httpStatus);

        System.out.println(httpStatus);

//    assertTrue(privateController.status().getStatusCode().);
    }

//    assertAll(
//                () -> assertEquals(2022, sortedModelsByYear.get(0).getYear()),
//            () -> assertEquals(2021, sortedModelsByYear.get(1).getYear()),
//            () -> assertEquals(2020, sortedModelsByYear.get(2).getYear()),
//            () -> assertEquals(3, sortedModelsByYear.size())
//            );


}
