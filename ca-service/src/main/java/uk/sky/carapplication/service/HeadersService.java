package uk.sky.carapplication.service;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import uk.sky.carapplication.model.Car;

import java.util.UUID;

@Service
public class HeadersService {

    public HttpHeaders createIDHeader(){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-sky-request-id", UUID.randomUUID().toString());
        return responseHeaders;

    }
}
