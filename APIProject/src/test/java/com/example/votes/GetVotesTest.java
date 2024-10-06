package com.example.votes;

import com.example.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetVotesTest extends BaseTest {

    @Test
    public void getVotes() {
        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";

        given().header("Content-Type","application/json").header("x-api-key",xApiKey)
                .when()
                .get("/v1/votes")
                .then()
                .time(lessThan(800L))
                .statusCode(200)
                .contentType(containsString("application/json"))
                .body("", not(empty()))
                .body("[0]", allOf(
                        hasKey("id"),
                        hasKey("image_id"),
                        hasKey("sub_id"),
                        hasKey("created_at"),
                        hasKey("value"),
                        hasKey("country_code"),
                        hasKey("image")
                ))
                .body("[0].id", instanceOf(Number.class))
                .body("[0].image_id", instanceOf(String.class))
                .body("[0].sub_id", instanceOf(String.class))
                .body("[0].created_at", instanceOf(String.class))
                .body("[0].value", instanceOf(Number.class))
                .body("[0].country_code", instanceOf(String.class))
                .body("[0].image.id", instanceOf(String.class))
                .body("[0].image.url", instanceOf(String.class));
    }
}

