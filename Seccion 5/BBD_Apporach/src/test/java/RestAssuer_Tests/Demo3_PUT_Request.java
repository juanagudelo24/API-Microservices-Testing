package RestAssuer_Tests;

import static io.restassured.RestAssured.given;
public class Demo3_PUT_Request {

	public static java.util.HashMap map=new java.util.HashMap();
	
	String empName=RestUtils.empName();
	String empSalary=RestUtils.empSal();
	String empAge=RestUtils.empAge();
	int emp_id=11501;
	
	@org.testng.annotations.BeforeClass
	public void putData()
	{
		map.put("name",empName);
		map.put("salary",empSalary);
		map.put("age",empAge);
		
		io.restassured.RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		io.restassured.RestAssured.basePath="/update/"+emp_id;
		
	}
	
	@org.testng.annotations.Test
	public void testPUT()
	{
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.log().all();
			
	}
		
	
}
