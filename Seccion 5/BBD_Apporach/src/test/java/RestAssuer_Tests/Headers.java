package RestAssuer_Tests;

import static io.restassured.RestAssured.given;


public class Headers {

    @org.testng.annotations.Test(priority = 1)
    public void GetPlaceInfo(){

        given()
                .param("types","supermarket")
                .param("key","AIzaSyCaBeEygyObeigBzDaqu3OVWy3VCwQIvM8")
                .when()
                    .get("https://maps.googleapis.com/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=500")
                .then()
                    .header("Content-Type", "application/xml; charset=UTF-8")
                    .header("Content-Encoding","gzip")
                    .header("Server","scaffolding on HTTPServer2");
    }
    @org.testng.annotations.Test(priority = 2)

    //Get Response Headers - single and all
    public void TestResponseHeader(){

        io.restassured.response.Response  response =
        given()
                .param("types","supermarket")
                .param("key","AIzaSyCaBeEygyObeigBzDaqu3OVWy3VCwQIvM8")
                .when()
                    .get("https://maps.googleapis.com/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=500");

        // Get single Header

               String Headervalue=  response.getHeader("Content-Type");
               System.out.println("Headervalue = " + Headervalue);

        // Get all Headers

         io.restassured.http.Headers headers = response.getHeaders();

         for (io.restassured.http.Header h:headers){
             System.out.println(h.getName() +":" + h.getValue());
         }
    }

}
