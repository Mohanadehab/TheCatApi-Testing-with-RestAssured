package Endpoints.images;
import Endpoints.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class ListUserImagesTest extends BaseTest {

    String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";

    @Test
    public void listUserImages() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-api-key", xApiKey)
                .when()
                .get("/v1/images/?limit=1&page=0&order=DESC")
                .then()
                .statusCode(200)
                .body("id", notNullValue())
                .extract().response();

    }
}