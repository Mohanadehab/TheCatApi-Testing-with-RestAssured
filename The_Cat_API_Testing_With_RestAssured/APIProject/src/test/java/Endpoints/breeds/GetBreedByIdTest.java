package Endpoints.breeds;
import Endpoints.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetBreedByIdTest extends BaseTest {

    @Test
    public void getBreedById() {
        String breedId = "abys";
        given()
                .pathParam("breed_id", breedId)
                .when()
                .get("/v1/breeds/{breed_id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(breedId));
    }
}