import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleMapsAPI {

    @Test
    void getweatherDetails()
    {
        //Specify base URI
        RestAssured.baseURI="https://maps.googleapis.com";

        // Request object
        RequestSpecification httprequest = RestAssured.given();

        //Response object

        Response response = httprequest.request(Method.GET,"maps/api/place/nearbysearch/xml?location=" +
                "-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyDI6DdXG5L2xP9BDaI7DYmLOwNgPFU7GRg");

        //print response in console window
        String responseBody= response.getBody().asPrettyString();
        System.out.println("responseBody = " + responseBody);

       //Captures and Verify headers
        String ContentType = response.header("Content-Type");
        System.out.println("ContentType = " + ContentType);
        Assert.assertEquals(ContentType,"application/xml; charset=UTF-8");

        String contentEncoding = response.header("Content-Encoding");
        System.out.println("contentEncoding = " + contentEncoding);
        Assert.assertEquals(contentEncoding,"gzip");


    }
}