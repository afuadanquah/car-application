package uk.sky.carapplication.service;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;
import uk.sky.carapplication.service.HeadersService;

import static org.junit.jupiter.api.Assertions.*;


public class HeaderServiceTest {

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
