package Endpoints.images;
import Endpoints.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.io.File;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class UploadImageTest extends BaseTest {
    public static String uploadedImageId;
    @Test
    public void uploadImage() {
        String imagePath = "C:\\Users\\20120\\Downloads\\The_Cat_API_Testing_Wirh_RestAssured\\APIProject\\111.jpg";
        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";
        File file = new File(imagePath);
        Response response = given()
                .header("x-api-key", xApiKey)
                .multiPart("file", file, "image/jpeg")
                .log().all()
                .when()
                .post("/v1/images/upload")
                .then()
                .log().all()
                .statusCode(201)
                .body("url", notNullValue())
                .extract()
                .response();

        String imageUrl = response.jsonPath().getString("url");

        uploadedImageId = response.jsonPath().getString("id");
    }
}