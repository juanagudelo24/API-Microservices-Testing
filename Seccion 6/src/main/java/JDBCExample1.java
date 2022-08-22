import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1) Create a connection
2) Create a query/statement
3) Execute statement/query
4) close connection

 * 
 */
public class JDBCExample1 {

	public static void main(String[] args) throws java.sql.SQLException {
		
		//Create a connection
		java.sql.Connection con= java.sql.DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/pdborcl"
				,"hr","hr");

		//Create a query/statement
		java.sql.Statement stmt=con.createStatement();
		//String s="insert into student values(101,'Scott')";
		//String s="update student set sname='KIM' where sid=105";
		String s="delete student where sid=105";
		
		//Execute statement/query
		stmt.executeQuery(s);
		
		//close connection
		con.close();
		
		System.out.println("Program is completed");
		
		
		
	}

}
