package Endpoints.favorites;
import Endpoints.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class GetFavoritesTest extends BaseTest {

    @Test

    public void getFavorites() {

        String xApiKey = "live_x0Ci0Nn0Nh0EF3wuTG457X6kxAk2y55ls2InkdKgFl4K70hLMDss0jrzv75bIn2E";
        given().header("Content-Type","application/json").header("x-api-key",xApiKey)
                .when()
                .get("/v1/favourites")
                .then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}