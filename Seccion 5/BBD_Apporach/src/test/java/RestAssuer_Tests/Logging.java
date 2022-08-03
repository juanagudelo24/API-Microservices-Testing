package RestAssuer_Tests;

import static io.restassured.RestAssured.*;

public class Logging {

    @org.testng.annotations.Test(priority = 1)
    void testLogging1(){

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                //.log().body()
                // .log().headers()
                .log().cookies()
                .log().all();

    }

    @org.testng.annotations.Test(priority = 2)
    void testLogging2(){

        given()
                .when()
                .get("https://reqres.in/api/users/23")
                .then()
               // .log().ifError()
                //.log().ifStatusCodeIsEqualTo(404)
                .log().ifValidationFails()
                .contentType("text/html;charset=-9");
    }
}
