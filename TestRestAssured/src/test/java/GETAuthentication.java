import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GETAuthentication {

    @Test
    public void GetAuthentication(){

        //Specify base URI
        RestAssured.baseURI="https://reqres.in/api";

        // Authentication
        /*PreemptiveBasicAuthScheme authscheme = new PreemptiveBasicAuthScheme();
        authscheme.setUserName("JuanA");
        authscheme.setPassword("TestPasword");

        RestAssured.authentication= authscheme;*/


        // Request object
        RequestSpecification httprequest = RestAssured.given();

        //print response in console window

        Response response = httprequest.request(Method.GET,"/users/2");

        //Status code validation
        int statuscode =  response.getStatusCode();
        System.out.println("statuscode = " + statuscode);
        Assert.assertEquals(statuscode,200);

        String responseBody= response.getBody().asPrettyString();
        System.out.println("responseBody = " + responseBody);


    }
}
