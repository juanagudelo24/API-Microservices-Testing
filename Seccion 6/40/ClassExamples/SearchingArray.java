package day4;

public class SearchingArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int num=100;
		
		boolean flag=false;
		
		for(int i:a)
		{
			if(i==num)
			{
				System.out.println("Element found");
				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
		{
		System.out.println("Element not found");
		}
		
	}

}
