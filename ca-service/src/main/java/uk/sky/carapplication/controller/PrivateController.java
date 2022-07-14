package uk.sky.carapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.sky.carapplication.service.HeadersService;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/private")
public class PrivateController {

    private final HeadersService headersService;

    //this is what RequiredArgsConstructor does for you
    public PrivateController(HeadersService headersService) {
        this.headersService = headersService;
    }

    @GetMapping("/status")
    public ResponseEntity<String> status(){
        return new ResponseEntity<>("OK", headersService.createIDHeader(), HttpStatus.OK);
    }


}
