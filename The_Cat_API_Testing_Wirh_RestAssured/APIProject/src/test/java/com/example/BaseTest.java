package com.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://api.thecatapi.com/";
    }

    // Utility method for GET request
    protected Response getRequest(String endpoint) {
        return RestAssured.given().when().get(endpoint);
    }
}
