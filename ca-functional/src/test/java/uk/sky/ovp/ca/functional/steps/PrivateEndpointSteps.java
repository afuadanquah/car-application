package uk.sky.ovp.ca.functional.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.sky.carapplication.service.HeadersService;
import uk.sky.ovp.ca.functional.models.HttpRequest;
import uk.sky.ovp.ca.functional.util.Client;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrivateEndpointSteps {

    private HttpRequest httpRequest;
    private Client client;

    public PrivateEndpointSteps(HttpRequest httpRequest, Client client) {
        this.httpRequest = httpRequest;
        this.client = client;
    }

    @When("The client calls {string}")
    public void clientSendsGetRequest(String endPoint) {
        httpRequest.setGetResponse(client.getResponse(endPoint));
    }

    @Then("The client receives a code of {int}")
    public void clientReceivesStatusCode(int statusCode){
        assertThat(httpRequest.getGetResponseStatusCode()).isEqualTo(statusCode);
    }

    @And("The client receives a body of {string}")
    public void clientReceivesResponseBody(String responseBody){
        assertThat(httpRequest.getGetResponseBody()).isEqualTo(responseBody);
    }

    @And("The client receives a header of {string}")
    public void clientReceivesIDHeader(String header){
        assertNotNull(httpRequest.getGetResponse().getHeader(header));
    }


}
