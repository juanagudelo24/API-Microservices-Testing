package RestAssuer_Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;





public class StudentNoSerialization {

    public java.util.HashMap map= new java.util.HashMap();

    //Post Request creates new student record
    @org.testng.annotations.Test(priority = 1)
    public void createNewStudent (){


         map.put("id",101);
         map.put("firstName","Pavan");
         map.put("lastName","Kumar");
         map.put("email","asaasf@gmail.com");
         map.put("programme","Manager");

        java.util.ArrayList<String> courseList = new java.util.ArrayList<String>();
        courseList.add("Java");
        courseList.add("Selenium");

        map.put("Couses",courseList);

        given()
                .contentType(io.restassured.http.ContentType.JSON)
                .body(map)
                    .when()
                    .post("http://localhost:8085/student")
                .then()
                    .statusCode(201)
                    .assertThat()
                    .body("msg",equalTo("Student Added"));

    }

    //GEt student record
    @org.testng.annotations.Test(priority = 2)
    public void GetStudentRecird(){

        given()
                .when()
                .get("http://localhost:8085/student/101")
                .then()
                .statusCode(200)
                .assertThat()
                .body("id",equalTo(101))
                .log().all();
    }

}
