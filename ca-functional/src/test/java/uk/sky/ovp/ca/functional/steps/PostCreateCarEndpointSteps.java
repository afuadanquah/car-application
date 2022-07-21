package uk.sky.ovp.ca.functional.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import uk.sky.carapplication.service.HeadersService;
import uk.sky.ovp.ca.functional.models.HttpRequest;
import uk.sky.ovp.ca.functional.util.Client;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@AllArgsConstructor
public class PostCreateCarEndpointSteps {

    private HttpRequest httpRequest;
    private Client client;

    @When("The client makes a call {string}")
    public void clientSendsPostRequest(String endPoint) {
        httpRequest.setPostResponse(client.getResponse(endPoint));
    }

    @Then("The client receives code of {int}")
    public void clientReceivesStatusCode(int statusCode){
        assertThat(httpRequest.getPostResponseStatusCode()).isEqualTo(statusCode);
    }

//    @And("The client receives body of {string}")
//    public void clientReceivesResponseBody(String responseBody){
//        assertThat(httpRequest.getPostResponseBody()).isEqualTo(responseBody);
//    }
}
