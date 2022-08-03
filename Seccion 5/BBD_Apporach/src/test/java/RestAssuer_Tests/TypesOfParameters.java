package RestAssuer_Tests;

import static io.restassured.RestAssured.given;

public class TypesOfParameters {

    @org.testng.annotations.Test(priority = 1)
    void testQueryParams(){

        // http://jsonplaceholder.typicode.com/comments?postId=1
        given()
                .queryParam("postId",1)
                .when()
                .get("http://jsonplaceholder.typicode.com/comments")
                .then()
                .statusCode(200)
                //.statusLine("")
                .log().all();
    }

    @org.testng.annotations.Test(priority = 2)
    void testPathParams(){

        // http://restapi.demoqa.com/utilities/weather/Delhi
        given()
                .pathParam("city","Delhi")
                .when()
                .get("http://restapi.demoqa.com/utilities/weather/{city}")
                .then()
                .statusCode(200)
                //.statusLine("")
                .log().all();
    }


}
