package liveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(PactConsumerTestExt.class) // this tells the JVM that this class should be run as a PactConsumer Junit test and not just a Junit Test
public class ConsumerTest {
    // Declare headers
    Map<String, String> headers = new HashMap<>();

    // Create the pact
    // we can write as many pact functions as we want and ultimately all of them will be added to a single pact
    @Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder){
       // Headers
        headers.put("Content-Type", "application/json");

       // Request and Response Body
        DslPart requestResponseBody = new PactDslJsonBody().  // DSL - Domain specific language | here our request and response are having same body so using only one body for both
            numberType("id", 123). // here the values are optional, in contract test, we only check the schema so value in this doesn't really make any difference as we are not doing functional testing
            stringType("firstName", "Hameedhul Arshadh"). // but  values in here makes it look realistic to the actual api response
            stringType("lastName", "A").
            stringType("email", "hameed@example.com");

       // Generate Contract
        return builder.given("Post Request").
                uponReceiving("request to create an user").
                method("POST").
                path("/api/users"). // which domain it is sent to will be determined by the actual test, contract doesn't care about it
                headers(headers).
                body(requestResponseBody).
            willRespondWith().
                status(201).
                body(requestResponseBody).
            toPact();
    }



    // Test with mock provider
    // the mock provider that pact makes is made using the pact contract
    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282") // this line creates the stubs and runs it
    public void consumerTest() {
        // Request body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 123); // value is not checked only the data type is checked
        reqBody.put("firstName", "Hameedhul Arshadh");
        reqBody.put("lastName", "A");
        reqBody.put("email", "hameed@example.com");

        // Send Request
        given().headers(headers).body(reqBody).log().all().
        when().post("http://localhost:8282/api/users").
        then().statusCode(201).body("firstName", equalTo("Hameedhul Arshadh")).log().all();

    }




}
