package day5;

public class StringSwappingWithoutThirdVariable {

	public static void main(String[] args) {
		
		String a = "Hello"; //5
		String b = "World"; //5
		
		System.out.println("before swapping: ");
		System.out.println("the value of a is:"+ a);
		System.out.println("the value of b is:"+ b);
		
		a=a+b;  //HelloWorld
		b=a.substring(0,a.length()-b.length());  //0,5 //Hello
		a=a.substring(b.length());
		
		System.out.println("After swapping: ");
		System.out.println("the value of a is:"+ a);
		System.out.println("the value of b is:"+ b);

				
	}

}
