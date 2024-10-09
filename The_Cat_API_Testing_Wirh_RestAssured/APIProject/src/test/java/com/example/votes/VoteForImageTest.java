package com.example.votes;

import com.example.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VoteForImageTest extends BaseTest {

    public String voteId;

    @Test
    public void voteForImage() {
        String imageId = "06sgw03sqswsw21";
        String sub_id = "my-user-1234";
        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";
        Response response = given().header("Content-Type","application/json").header("x-api-key",xApiKey)

                .body("{\"image_id\": \"" + imageId + "\", \"sub_id\": \"" +sub_id + "\" , \"value\": 1}")
                .when()
                .post("/v1/votes")
                .then()
                .statusCode(201)
                .extract()
                .response();

        voteId = response.jsonPath().getString("id");
        System.out.println("Vote ID: " + voteId);
    }
}
