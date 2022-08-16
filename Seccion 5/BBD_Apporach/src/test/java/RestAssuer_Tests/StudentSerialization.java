package RestAssuer_Tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class StudentSerialization {

    @org.testng.annotations.Test(priority = 1)
    public void createNewStudentSerialization() {

        java.util.ArrayList<String> courseList = new java.util.ArrayList<String>();

        courseList.add("Java");
        courseList.add("Selenium");

        Student stu = new RestAssuer_Tests.Student();
        stu.setSID(101);
        stu.setFirstName("John");
        stu.setLastName("Deo");
        stu.setEmail("asf@gmail.com");
        stu.setProgramme("Computer Science");
        stu.setCourses(courseList);

        given()
                .contentType(io.restassured.http.ContentType.JSON)
                .body(stu)
                .when()
                .post("http://localhost:8085/student")
                .then()
                .statusCode(201)
                .assertThat()
                .body("msg", equalTo("Student Added"));

    }

    @org.testng.annotations.Test(priority = 2)
    public  void createNewStudentDeSerialization() {

        Student stu =
        get("http://localhost:8085/student").as(Student.class);
        System.out.println(stu.getStudentRecord());
        org.testng.Assert.assertEquals(stu.getSID(),101);

    }
}

