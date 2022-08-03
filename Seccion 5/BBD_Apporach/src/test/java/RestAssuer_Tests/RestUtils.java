package RestAssuer_Tests;

public class RestUtils {


	public static String getFirstName() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);
	}

	public static String getLastName() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(1);
		return ("Kenedy"+generatedString);
	}
	
	public static String getUserName() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(3);
		return ("John"+generatedString);
	}
	
	public static String getPassword() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(3);
		return ("John"+generatedString);
	}
	
	public static String getEmail() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(3);
		return (generatedString+"gmail.com");
	}
	
	public static String empName() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomAlphabetic(1);
		return ("John"+generatedString);
	}

	public static String empSal() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	
	public static String empAge() {
		String generatedString = org.apache.commons.lang3.RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}

	public static  String generateStringFromResource(String path) throws java.io.IOException {

		return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(path)));
	}
	
}
