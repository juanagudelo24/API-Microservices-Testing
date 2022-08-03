package RestAssuer_Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class RootSetings_RootPath {

  // Without Root
    @org.testng.annotations.Test(priority = 1)
    public void TestwithoutRootJSON() {

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .body("data.id[0]", equalTo(7))
                .body("data.first_name[0]", equalTo("Michael"))
                .body("data.last_name[0]", equalTo("Lawson"));
    }
  // With root
    @org.testng.annotations.Test(priority = 2)
    public void TestwithRootJSON() {

        given()
                .when()
                    .get("https://reqres.in/api/users?page=2")
                .then()
                    .rootPath("data")
                    .body("id[0]", is(7))
                    .body("first_name[0]", is("Michael"))
                    .body("last_name[0]", is("Lawson"));
    }

     //With Detach
    @org.testng.annotations.Test(priority = 3)
    public void TestWithDetachRoot() {

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .rootPath("RestResponse.result")
                .body("name", is("India"))
                .body("alpha2_name", is("IN"))

                .detachRootPath("result")
                .body("result.alpha3_code", is("IND"));
    }

    //Root XMl

    @org.testng.annotations.Test(priority = 4)
    void testWithDetachFileXML(){

        given()
                .when()
                    .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
                .then()
                    .rootPath("CUSTOMER")
                    .body("FIRSTNAME",is("Bill"))
                    .body("LASTNAME",is("Clancy"))

                    .detachRootPath("CUSTOMER")

                    .body("CUSTOMER.STREET",is("319 Upland Pl."))
                    .body("CUSTOMER.CITY",is("Seattle"))
                    .log().all();

    }

}
