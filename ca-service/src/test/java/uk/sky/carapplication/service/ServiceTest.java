package uk.sky.carapplication.service;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class ServiceTest {

    private HeadersService headersService;

    @BeforeEach
    public void setUp(){
        headersService = new HeadersService();
    }

    @Test
    public void testThatIDIsGenerated(){
        assertFalse(headersService.createIDHeader().isEmpty());
    }
}
