package uk.sky.carapplication.controller;

import org.junit.jupiter.api.*;

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
