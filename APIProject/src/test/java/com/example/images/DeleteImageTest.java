package com.example.images;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class DeleteImageTest {


    @Test(dependsOnMethods = "com.example.images.UploadImageTest.uploadImage")
    public void deleteImage() {
        String imageId = UploadImageTest.uploadedImageId;
        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";

        given()
                .header("x-api-key", xApiKey)
                .pathParam("image_id", imageId)
                .when()
                .delete("/v1/images/{image_id}")
                .then()
                .log().all()
                .statusCode(204);
    }
}
