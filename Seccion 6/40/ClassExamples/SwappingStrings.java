package day5;

public class SwappingStrings {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2="xyz";
		
		String s;
		
		System.out.println("Before swapping....");
		
		System.out.println("s1 is :" +s1);
		System.out.println("s2 is :" +s2);
		
		
		s=s1;  //abc
		s1=s2;  //xyz
		s2=s; //abc
		
		System.out.println("After swapping....");
		
		System.out.println("s1 is :" +s1);
		System.out.println("s2 is :" +s2);
		
		
		
	}

}
