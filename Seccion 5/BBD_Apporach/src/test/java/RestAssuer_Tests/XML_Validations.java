package RestAssuer_Tests;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class XML_Validations {

    // Veryfying single content

    @org.testng.annotations.Test(priority = 1)
    void testSingleContent(){
        given()
                .when()
                .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
                .then()
                .body("CUSTOMER.ID",equalTo("15"))
                .log().all();

    }

     // Multiple content
    @org.testng.annotations.Test(priority = 2)
    void testMultipleContent(){
        given()
                .when()
                .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
                .then()
                .body("CUSTOMER.ID",equalTo("15"))
                .body("CUSTOMER.FIRSTNAME",equalTo("Bill"))
                .body("CUSTOMER.LASTNAME",equalTo("Clancy"))
                .body("CUSTOMER.STREET",equalTo("319 Upland Pl."))
                .body("CUSTOMER.CITY",equalTo("Seattle"))
                .log().all();

    }
    // ALl in one go
    @org.testng.annotations.Test(priority = 3)
    void testMultipleContent2(){
        given()
                .when()
                .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
                .then()
                .body("CUSTOMER.text()",equalTo("15BillClancy319 Upland Pl.Seattle"))
                .log().all();

    }

    //Find values using XMl path

    @org.testng.annotations.Test(priority = 4)
    void testXmlPath(){

        given()
                .when()
                    .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
                .then()
                    .body(hasXPath("/CUSTOMER/FIRSTNAME"),containsString("Bill"))
                    .log().all();

    }

    @org.testng.annotations.Test(priority = 5)
    void testXmlPath2(){

        given()
                .when()
                .get("http://thomas-bayer.com/sqlrest/INVOICE/")
                .then()
                .body(hasXPath("/INVOICEList/INVOICE[text()='30']"))
                .log().all();

    }



}
