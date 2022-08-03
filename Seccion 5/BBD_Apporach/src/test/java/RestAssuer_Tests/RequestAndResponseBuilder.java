package RestAssuer_Tests;

import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.RestAssured.given;


public class RequestAndResponseBuilder {

    io.restassured.specification.RequestSpecification requestSpec;
    io.restassured.specification.ResponseSpecification responseSpec;

    @org.testng.annotations.BeforeClass ()
    void Setup(){
        RequestSpecBuilder req_Builder = new RequestSpecBuilder();

        req_Builder.addParam("myParam","paramValue1");
        req_Builder.addHeader("My header","headervalue1");
        req_Builder.setBaseUri("http://jsonplaceholder.typicode.com");
        req_Builder.setContentType(io.restassured.http.ContentType.JSON);
        requestSpec=req_Builder.build();

        io.restassured.builder.ResponseSpecBuilder res_builder=
                new io.restassured.builder.ResponseSpecBuilder();

        res_builder.expectStatusCode(200);
        res_builder.expectStatusLine("HTTP/1.1 200 OK");
        res_builder.expectHeader("Content-Type","application/json; charset=utf-8");
        res_builder.expectHeader("Content-Encoding","gzip");
        responseSpec=res_builder.build();

    }

    @org.testng.annotations.Test(priority = 1)
    void test_Albums(){
        given()
                .spec(requestSpec)
                .when()
                    .get("/users/1/albums")
                .then()
                 .spec(responseSpec)
                .log().all();

    }

    @org.testng.annotations.Test(priority = 2)
    void test_Todos() {
        given()
                .spec(requestSpec)
                .when()
                .get("users/1/todos ")
                .then()
                .spec(responseSpec)
                .log().all();
    }


    @org.testng.annotations.Test(priority = 3)
    void test_Post() {
        given()
                .spec(requestSpec)
                .when()
                .get("/users/1/post ")
                .then()
                .spec(responseSpec)
                .log().all();
    }


    }
