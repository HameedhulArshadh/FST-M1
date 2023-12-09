package liveProject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GitHubProject {
    static String auth = "token " + "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";
    static String baseURL = "https://api.github.com";
    static int sshId;
    static RequestSpecification reqSpec;



    @BeforeClass
    public void setup(){
        reqSpec = new RequestSpecBuilder().
                                        setBaseUri(baseURL).
                                        addHeader("Content-Type", "application/json").
                                        addHeader("Authorization", auth).
                                        build();
    }

    @Test(priority = 0)
    public void getEmails(){
        Response response = given().spec(reqSpec).log().all().when().get("/user/emails");
        Reporter.log("Response:\n");
        Reporter.log(response.then().extract().asPrettyString().toString());
        response.then().statusCode(200);
    }

    @Test(priority = 1)
    public void postSSHKey(){
        Map<String, String> body = new HashMap<>();
        body.put("title", "TestAPIKey");
        body.put("key", "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAID3yT4zcrI3DaggdR61jyR4wFz8w0mxxXudx5wMEbhZ0");

        Response response = given().spec(reqSpec).body(body).log().all().when().post("/user/keys");
        Reporter.log("Response:\n");
        Reporter.log(response.then().extract().asPrettyString().toString());
        response.then().statusCode(201);
        sshId = response.path("id"); //86892415
    }

    @Test(priority = 2)
    public void getSSHKey(){
        Response response = given().spec(reqSpec).pathParam("sshId", sshId).log().all().when().get("/user/keys/{sshId}");
        Reporter.log("Response:\n");
        Reporter.log(response.then().extract().asPrettyString().toString());
        response.then().statusCode(200);
    }

    @Test(priority = 3)
    public void deleteSSHKey(){
        Response response = given().spec(reqSpec).pathParam("sshId", sshId).log().all().when().delete("/user/keys/{sshId}");
        Reporter.log("Response:\n");
        Reporter.log(response.then().extract().asPrettyString().toString());
        response.then().statusCode(204);
    }

}
