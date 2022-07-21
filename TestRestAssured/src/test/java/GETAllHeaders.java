import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETAllHeaders {

    @Test
    public void GetAllHeaders(){

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

        //capture all headers from response
        Headers allheaders = response.headers();

        System.out.println("The headers are: ");

        for (Header header:allheaders){
            System.out.println(header.getName() +" "+ header.getValue());
        }

    }
}
