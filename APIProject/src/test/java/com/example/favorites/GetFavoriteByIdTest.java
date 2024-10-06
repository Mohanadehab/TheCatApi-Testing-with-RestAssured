package com.example.favorites;

import com.example.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetFavoriteByIdTest extends BaseTest {

    @Test(dependsOnMethods = {"com.example.favorites.AddFavoriteTest.addFavorite"}) // Ensure this runs after adding a favorite
    public void getFavoriteById() {
        String favId = AddFavoriteTest.favId;
        if (favId == null) {
            throw new IllegalStateException("Favorite ID is null. Make sure it is initialized before calling delete.");
        }

        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";

        given()
                .header("Content-Type", "application/json")
                .header("x-api-key", xApiKey)
                .pathParam("favourite_id", favId)
                .when()
                .get("/v1/favourites/{favourite_id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(Integer.parseInt(favId)));
    }
}
