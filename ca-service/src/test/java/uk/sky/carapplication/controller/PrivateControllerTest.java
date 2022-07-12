package uk.sky.carapplication.controller;

import org.junit.jupiter.api.*;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


public class PrivateControllerTest {

    private PrivateController privateController;

    @BeforeEach
    public void setUp(){
        privateController = new PrivateController();
    }

    @Test
    public void testThatStatusCodeIsCorrect(){
        assertTrue(privateController.status().getStatusCode().is2xxSuccessful());
    }

    @Test
    public void testThatBodyIsCorrect(){
        assertTrue(Objects.requireNonNull(privateController.status().getBody()).matches("OK"));
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
