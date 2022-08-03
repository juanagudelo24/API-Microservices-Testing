package RestAssuer_Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ResponseInDifferentWays {


    // GetREsponse As as String
    @org.testng.annotations.Test(priority = 1)
    public  void TestGetResponseAsString(){

        String response =
                given()
                .when()
                    .get("https://reqres.in/api/users/2")
                    .asPrettyString();

        //String response =.get("https://reqres.in/api/users/2").asPrettyString();
        System.out.println("My Response is= " + response);
    }

    @org.testng.annotations.Test(priority = 2)
    public  void TestExtractDetailUsingPath() {

               String myURL =  given()
                        .when()
                        .get("http://jsonplaceholder.typicode.com/photos/1")
                        .then()
                        .contentType(io.restassured.http.ContentType.JSON)
                        .body("albumId",is(1))
                        .extract().path("url");

        System.out.println("myURL = " + myURL);
    }

  //Extract one line

    @org.testng.annotations.Test(priority = 3)
    public  void TestExtractPathinOneline() {
        //Approach 1
        String href1 =get("http://jsonplaceholder.typicode.com/photos/1").path("thumbnailUrl");
        System.out.println("href1 = " + href1);

        //Approach 2

        String href2 = get("http://jsonplaceholder.typicode.com/photos/1").andReturn().jsonPath().get("thumbnailUrl");
        System.out.println("href2 = " + href2);

        when()
                .get(href1)
                .then()
                    .statusCode(200);

    }

    //Extract details for further use

    @org.testng.annotations.Test(priority = 4)
    public  void TestEctractDetailForfutherUSe() {

        io.restassured.response.Response response =  given().
                when()
                .get("http://jsonplaceholder.typicode.com/photos/1")
                .then()
                .extract().response();

        System.out.println("Content type= " + response.contentType());
        System.out.println("title = " + response.path("title"));
        System.out.println("StatusCode = " + response.getStatusCode());

    }



}
