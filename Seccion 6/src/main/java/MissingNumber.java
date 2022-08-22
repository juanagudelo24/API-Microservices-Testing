public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7,8,9};

		int total=0;
		
		for(int num:a)
		{
			total=total+num; //total of 1...9 number without missing value
		}
		
		
		int total1=0;
		
		for(int i=1;i<=9;i++) // total of 1...9 numbers
		{
			total1=total1+i;
		}
		
		System.out.println("Missing value is:"+ (total1-total));
	}

}
