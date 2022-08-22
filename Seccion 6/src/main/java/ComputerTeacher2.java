class Teacher2 {
	String designation = "Teacher";
	String collegeName = "BusyQA";

	void does() {
		System.out.println("Teaching");
	}
}

public class ComputerTeacher2 extends Teacher2 {
	
	String mainSubject = "Selenium Automation";

	public static void main(String args[]) {
		ComputerTeacher2 obj = new ComputerTeacher2();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	}
}