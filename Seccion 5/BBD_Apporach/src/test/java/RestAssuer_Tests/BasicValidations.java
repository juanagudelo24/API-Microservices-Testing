package RestAssuer_Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class BasicValidations {


    // Status Code
    @org.testng.annotations.Test(priority = 1)
    public void testStatusCode(){

        given()
                .when()
                    .get("http://jsonplaceholder.typicode.com/posts/5")
                .then()
                    .statusCode(200);
                    //.log().all();
    }

    // log response
    @org.testng.annotations.Test(priority = 2)
    public void testLogging(){
        given()
                .when()
                     .get("http://jsonplaceholder.typicode.com/posts/5")
                .then()
                .statusCode(200)
                .log().all();

    }

    //Single content
   @org.testng.annotations.Test(priority = 3)
    public void testSinglecontent(){
         given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .body("data.id[1]",equalTo(8));


    }

    //Multiple content

    @org.testng.annotations.Test(priority = 4)
    public void testMultiplecontent() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id", hasItems(7,8,9,10,12))
                .log().all();


    }

    // Setting parameters and headers

    @org.testng.annotations.Test(priority = 5)
    public void setParametersAndHeaders(){
        given()
                .param("Myname","juan")
                .header("Myheader","Colombian")
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .body("data.id[1]",equalTo(8));

    }
}
