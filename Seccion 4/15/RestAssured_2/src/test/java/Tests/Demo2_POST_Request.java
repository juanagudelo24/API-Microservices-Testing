package Tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Demo2_POST_Request {
	
	public static java.util.HashMap map=new java.util.HashMap();
	
	@org.testng.annotations.BeforeClass
	public void postdata()
	{
		map.put("FirstName",RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());	
		map.put("Email", RestUtils.getEmail());
		
		io.restassured.RestAssured.baseURI="http://restapi.demoqa.com/customer";
		io.restassured.RestAssured.basePath="/register";
	}
	
	@org.testng.annotations.Test
	public void testPost()
	{
	given()
		.contentType("application/json")
		.body(map)
	
	.when()
	
		.post()
			
	.then()
		.statusCode(201)
		.and()
		.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		.and()
		.body("Message",equalTo("Operation completed successfully"));
	
	}

}










