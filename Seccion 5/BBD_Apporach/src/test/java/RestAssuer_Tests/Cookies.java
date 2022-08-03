package RestAssuer_Tests;

import static io.restassured.RestAssured.given;


public class Cookies {

    // validate cookies

    @org.testng.annotations.Test(priority = 1)
    public void TestCookies() {

        given()
                .when()
                .get("http://jsonplaceholder.typicode.com/photos ")
                .then()
                .cookie("Cookie_name", "Expected value");
    }

    // GET Cookies

    @org.testng.annotations.Test(priority = 2)
    public void TestSpecificCookies() {

        io.restassured.response.Response response =
                given()
                        .when()
                        .get("http://jsonplaceholder.typicode.com/photos ");

        // Get specific cookie from response

        response.getCookie("Cookie_name");
        System.out.println("Cookie= " + response);


        // Get all cookies from response

        java.util.Map<String, String> cookies_value = response.getCookies();

        for (java.util.Map.Entry entry : cookies_value.entrySet()) {

            entry.getKey();
            entry.getValue();

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

    // Specific Detail

    @org.testng.annotations.Test(priority = 3)
    public void TestSpecificDetail() {

        io.restassured.response.Response response =
                given()
                        .when()
                        .get("http://jsonplaceholder.typicode.com/photos ");


        //GET cookie
        io.restassured.http.Cookie cookie_info = response.getDetailedCookie("Cookie_name");
        cookie_info.hasExpiryDate();
        System.out.println("cookie_info = " +  cookie_info.hasExpiryDate());
        System.out.println("cookie_info.getExpiryDate() = " + cookie_info.getExpiryDate());
        
    }
}
