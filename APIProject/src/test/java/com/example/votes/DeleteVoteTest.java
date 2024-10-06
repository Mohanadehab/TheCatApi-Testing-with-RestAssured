package com.example.votes;

import com.example.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeleteVoteTest extends BaseTest {

    @Test
    public void deleteVote() {
        String voteId = "your_vote_id_here";

        given()
                .pathParam("vote_id", voteId)
                .when()
                .delete("/v1/votes/{vote_id}")
                .then()
                .statusCode(200)
                .body("message", equalTo("SUCCESS"));
    }
}
