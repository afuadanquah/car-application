package uk.sky.carapplication.controller;

import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.HttpStatus;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class PrivateControllerTest {

    @Test
    public void statusCodeIsCorrect(){
    PrivateController privateController = new PrivateController();
    assertTrue(privateController.status().getStatusCode().is2xxSuccessful());
    }



//    //@ValueSource(ints = {HttpStatus.BAD_REQUEST})
//    private static List<HttpStatus> getBadHTTPStatuses(){
//        return List.of(HttpStatus.BAD_REQUEST, HttpStatus.BAD_GATEWAY);
//    }
//    @ParameterizedTest
//    @MethodSource("getBadHTTPStatuses")
//    public void statusCodeIsIncorrect(HttpStatus httpStatus){
//    PrivateController privateController = new PrivateController();;
//
//    assertEquals(httpStatus.value(), privateController.status().getStatusCode().value());
//
//        System.out.println(httpStatus);

//    assertTrue(privateController.status().getStatusCode().);
    }

//    assertAll(
//                () -> assertEquals(2022, sortedModelsByYear.get(0).getYear()),
//            () -> assertEquals(2021, sortedModelsByYear.get(1).getYear()),
//            () -> assertEquals(2020, sortedModelsByYear.get(2).getYear()),
//            () -> assertEquals(3, sortedModelsByYear.size())
//            );


}
