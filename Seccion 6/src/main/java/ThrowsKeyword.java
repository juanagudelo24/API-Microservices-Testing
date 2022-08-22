import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws java.io.IOException, InterruptedException {
		
		java.io.FileReader fr=null;
		fr = new java.io.FileReader("C:\\SeleniumPractice\\Test.txt");
		
		java.io.BufferedReader bfr=new java.io.BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);

	}

}
