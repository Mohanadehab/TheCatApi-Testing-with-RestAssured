package com.example.breeds;

import com.example.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;


public class GetBreedsTest extends BaseTest {

    @Test public void getBreeds() {

        given().when().get("/v1/breeds").then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}
