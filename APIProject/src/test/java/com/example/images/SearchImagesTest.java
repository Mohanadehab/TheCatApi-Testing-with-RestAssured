package com.example.images;

import com.example.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class SearchImagesTest extends BaseTest {

    @Test
    public void searchImages() {
        given()
                .when()
                .get("/v1/images/search")
                .then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}
