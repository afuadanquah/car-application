package uk.sky.carapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.sky.carapplication.service.HeadersService;

@RestController
@RequestMapping("/private")
public class PrivateController {

    private HeadersService headersService;

    @GetMapping("/status")
    public ResponseEntity<String> status(){

        headersService = new HeadersService();
        return new ResponseEntity<>("OK", headersService.createIDHeader(), HttpStatus.OK);

    }

}
