import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POSTRequest {

    @Test
    void registerCustomer(){

        //Specify base URI
        RestAssured.baseURI="https://reqres.in/api";

        // Request object
        RequestSpecification httprequest = RestAssured.given();

        //Request payload  sending along with post request

        JSONObject requestparams = new JSONObject();
        requestparams.put("name","Juan");
        requestparams.put("job","QA Analyst");

       /* requestparams.put("Username","Juan");
        requestparams.put("Password","Juan");
        requestparams.put("Email","juan@gmail.com");*/

        httprequest.header("ContentType","Applicarions/JSON");
        httprequest.body(requestparams.toJSONString());

        //Response object
        Response response = httprequest.request(Method.POST,"/users");

        //print response in console window
        String responseBody= response.getBody().asPrettyString();
        System.out.println("responseBody = " + responseBody);

        //Status code validation
        int statuscode =  response.getStatusCode();
        System.out.println("statuscode = " + statuscode);
        Assert.assertEquals(statuscode,201);


    }
}
