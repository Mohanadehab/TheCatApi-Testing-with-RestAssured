package com.example.favorites;

import com.example.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AddFavoriteTest extends BaseTest {

    public static String favId;

    @Test(groups = "step1")
    public void addFavorite() {
        String imageId = "12300100-" ;
        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";
        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-api-key", xApiKey)
                .body("{\"image_id\": \"" + imageId + "\", \"sub_id\": \"my-user-1234\"}")
                .when()
                .post("/v1/favourites")
                .then()
                .statusCode(200)
                .extract()
                .response();

        favId = response.jsonPath().getString("id");

    }

}
