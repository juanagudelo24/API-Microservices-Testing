package RestAssuer_Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Authentication {

	//Basic Authentication
	//@Test
	void testBasicAuthentication()
	{
		
		given()
			//.auth().basic("ToolsQA", "TestPassword")
		.auth().preemptive().basic("ToolsQA", "TestPassword")
		//.auth().digest("ToolsQA", "TestPassword")
		
		.when()
		
			.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
		
		.then()
			.statusCode(200)
			.assertThat().body("FaultId",equalTo("OPERATION_SUCCESS"))
			.assertThat().body("Fault",equalTo("Operation completed successfully"))
			.log().all();
			
	}
	
	
	///Bearer Token Authentication
	@org.testng.annotations.Test(priority=2)
	void testBearerTokenAuthentication() throws java.io.IOException
	{
		
		String bearerToken="E4F284BFADA11D01A52508ED7B92FFD7EE0905659F5DED06A4B73FC7739B48A287648801";
		String myRequest=RestUtils.generateStringFromResource(".\\Resources\\PostData.txt");
	
		given()
			.headers("Authorization","Bearer " +bearerToken)
			.contentType("text/xml")
			.body(myRequest)
		.when()
			.post("https://certtransaction.elementexpress.com")
		
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 200 OK")
			.log().all();
	
	}
	
	
	
}
