package day7;

public class FinalVariableDemo {

	final int speed=40; // final varaible, so we cannot change this value
	
	
	public static void main(String[] args) {
		
		FinalVariableDemo fm=new FinalVariableDemo();
		fm.speed=100;  // compile time error
		System.out.println(fm.speed);
	}

}
