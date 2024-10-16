package Endpoints.images;
import Endpoints.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetImageTest extends BaseTest {

    @Test
    public void getImage() {
        String imageId = "BDb8ZXb1v";

        given()
                .pathParam("image_id", imageId)
                .when()
                .get("/v1/images/{image_id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(imageId));
    }
}