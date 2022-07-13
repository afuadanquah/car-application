package uk.sky.ovp.ca.functional.util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Component
@Slf4j

public class Client {

    @Value("${service.base.url}")
    private String baseURL;

    RequestSpecBuilder spec = new RequestSpecBuilder();

    public Response getResponse(String endPath) {
        RequestSpecification request = spec.build();
        log.info("obtaining URL :" + baseURL + endPath);
        return given(request).get(endPath);
    }
}
