package Endpoints.breeds;


import Endpoints.BaseTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.notNullValue;

public class GetBreedsTest extends BaseTest {

    @Test
    public void getBreeds() {
        getRequest("/v1/breeds").then()
                .statusCode(200)
                .body("id", notNullValue());
    }
}