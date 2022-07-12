package uk.sky.carapplication.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping("/status")
    public ResponseEntity<String> status(){

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-sky-id", UUID.randomUUID().toString());

        return new ResponseEntity<>("OK", responseHeaders, HttpStatus.OK);


    }

}
