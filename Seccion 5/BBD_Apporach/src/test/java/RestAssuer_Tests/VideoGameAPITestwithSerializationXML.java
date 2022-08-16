package RestAssuer_Tests;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VideoGameAPITestwithSerializationXML {

	@org.testng.annotations.Test(priority=1)
    public void testVideoGameSerializationXML() {

		VideoGame myVideoGame=new VideoGame();
		myVideoGame.setId(11);
		myVideoGame.setName("xyz123");
		myVideoGame.setReleaseDate("2019-06-17");
		myVideoGame.setReviewScore(90);
		myVideoGame.setCategory("Driving");
		myVideoGame.setRating("Five");
		
        given().
        		contentType("application/xml").
                body(myVideoGame).
        when()
                .post("http://localhost:8080/app/videogames").
        then()
           		.log().all()
        		.body(equalTo("{\"status\": \"Record Added Successfully\"}"));
    }
	
	@org.testng.annotations.Test(priority=2)
	    public void testVideoGameDeSerializationXML() {

	        VideoGame myVideoGame = get("http://localhost:8080/app/videogames/11").as(VideoGame.class);

	        System.out.println(myVideoGame.toString());
	    }
	 
	 
}
