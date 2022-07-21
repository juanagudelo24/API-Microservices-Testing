import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GETResponseBody {

    @Test
    public void GetResponseBody(){

        //Specify base URI
        RestAssured.baseURI="https://reqres.in/api";

        // Request object
        RequestSpecification httprequest = RestAssured.given();

        //Response object

        Response response = httprequest.request(Method.GET,"/users/2");

        //print response in console window
        String responseBody= response.getBody().asPrettyString();
        System.out.println("responseBody = " + responseBody);

        Assert.assertEquals(responseBody.contains("Janet"),true);

    }
}
