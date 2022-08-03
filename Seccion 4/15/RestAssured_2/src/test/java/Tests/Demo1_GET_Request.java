package Tests;

import static io.restassured.RestAssured.given;

/*
given()
	set cookies, add auth, add param, set headers info etc....
when()
	get, post,put,delete...	

then()
	validate status code, extract response, extract headers cookies & response body....
 */
public class Demo1_GET_Request {

	@org.testng.annotations.Test
	public void getWeatherDetails()
	{
		given()
		.when()
			.get("https://reqres.in/api/users/2")
		.then()
			.statusCode(200);
			//.statusLine("HTTP/1.1 200 OK")
			//.assertThat().body("City", equalTo("Hyderabad"))
			//.header("Content-Type","application/json");
		
	}
		
}
