import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GET_ExtractAllValuesJSON {

        @Test
        public void GetResponseBody(){

            //Specify base URI
            RestAssured.baseURI="https://reqres.in/api";

            // Request object
            RequestSpecification httprequest = RestAssured.given();

            //Response object

            Response response = httprequest.request(Method.GET,"/users/2");

            JsonPath jsonpath = response.jsonPath();

            System.out.println("id= " + jsonpath.get("data.id"));
            System.out.println("email= " + jsonpath.get("data.email"));
            System.out.println("first_name= " + jsonpath.get("data.first_name"));
            System.out.println("last_name= " + jsonpath.get("data.last_name"));

            Assert.assertEquals(jsonpath.get("data.email"),"janet.weaver@reqres.in");


        }
}
