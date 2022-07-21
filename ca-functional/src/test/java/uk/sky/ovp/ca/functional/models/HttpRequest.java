package uk.sky.ovp.ca.functional.models;

import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.post;

@Component
public class HttpRequest {
    private Response getResponse = get();
    private Response postResponse = post();

    public Response getGetResponse() {
        return getResponse;
    }

    public void setGetResponse(Response response) {
        this.getResponse = response;
    }

    public String getGetResponseBody() {
        return this.getResponse.getBody().asString();
    }

    public int getGetResponseStatusCode() { return this.getResponse.getStatusCode(); }

    //Post Responses
    public Response getPostResponse() {
        return postResponse;
    }

    public void setPostResponse(Response response) {
        this.postResponse = response;
    }

    public String getPostResponseBody() {
        return this.postResponse.getBody().asString();
    }

    public int getPostResponseStatusCode() { return this.postResponse.getStatusCode(); }
}
