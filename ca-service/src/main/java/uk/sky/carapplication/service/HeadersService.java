package uk.sky.carapplication.service;

import org.springframework.http.HttpHeaders;

import java.util.UUID;

public class HeadersService {

    public HttpHeaders createIDHeader(){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("x-sky-request-id", UUID.randomUUID().toString());
        return responseHeaders;
    }
}
