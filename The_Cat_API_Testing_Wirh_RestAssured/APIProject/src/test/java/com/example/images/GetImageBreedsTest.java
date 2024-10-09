package com.example.images;

import com.example.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class GetImageBreedsTest extends BaseTest {

    @Test
    public void getImageBreeds() {
        String imageId = "BDb8ZXb1v";

        given()
                .pathParam("image_id", imageId)
                .when()
                .get("/v1/images/{image_id}/breeds")
                .then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}
