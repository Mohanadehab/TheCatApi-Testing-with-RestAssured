package com.example.images;

import com.example.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class GetImageAnalysisTest extends BaseTest {

    @Test
    public void getImageAnalysis() {
        String imageId = "your_image_id_here";

        given()
                .pathParam("image_id", imageId)
                .when()
                .get("/v1/images/{image_id}/analysis")
                .then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}
