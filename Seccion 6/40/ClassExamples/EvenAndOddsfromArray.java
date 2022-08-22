package day4;

public class EvenAndOddsfromArray {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		//Extract/print even numbers from array
		
		System.out.println("List of even numbers..............");
		for(int num:a)
		{
			
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		
		
		System.out.println("List of odd numbers...............");
		
		for(int num:a)
		{
			
			if(num%2!=0)
			{
				System.out.println(num);
			}
		}
		

	}

}
