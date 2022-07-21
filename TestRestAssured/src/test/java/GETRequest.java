import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GETRequest {

    @Test
    void getweatherDetails()
    {
        //Specify base URI
        RestAssured.baseURI="https://reqres.in/api";

        // Request object
        RequestSpecification httprequest = RestAssured.given();

        //Response object

        Response response = httprequest.request(Method.GET,"/users/2");
        
        //print response in console window
        
        String responseBody= response.getBody().asPrettyString();
        System.out.println("responseBody = " + responseBody);

        //Status code validation
        int statuscode =  response.getStatusCode();
        System.out.println("statuscode = " + statuscode);
        Assert.assertEquals(statuscode,200);

        //status line verifications
        String statusline = response.statusLine();
        System.out.println("statusline = " + statusline);
        Assert.assertEquals(statusline,"HTTP/1.1 200 OK");
        

    }
}
