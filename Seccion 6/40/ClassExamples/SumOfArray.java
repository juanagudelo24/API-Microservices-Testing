package day4;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int sum=0;
		
		for(int num:a)
		{
			sum=sum+num; //10 30 60 100 150
		}

		
		System.out.println("Sum of array elements is :" +sum);
	}

}
