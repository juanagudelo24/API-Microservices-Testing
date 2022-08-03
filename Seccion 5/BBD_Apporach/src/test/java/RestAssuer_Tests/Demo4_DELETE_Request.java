package RestAssuer_Tests;

import static io.restassured.RestAssured.given;

public class Demo4_DELETE_Request {

	@org.testng.annotations.Test
	public void deleteEmployeeRecord()
	{
		
		io.restassured.RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		io.restassured.RestAssured.basePath="/delete/11499";
		
		io.restassured.response.Response response=
		
		given()
		
		.when()
				.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();
			
			String jsonAsString=response.asString();
			org.testng.Assert.assertEquals(jsonAsString.contains("Successfully! Record has been deleted"),true);
	}
	
}
