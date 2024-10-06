package com.example.breeds;

import com.example.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class SearchBreedsTest extends BaseTest {

    @Test
    public void searchBreeds() {
        given()
                .when()
                .get("/v1/breeds/search")
                .then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}
