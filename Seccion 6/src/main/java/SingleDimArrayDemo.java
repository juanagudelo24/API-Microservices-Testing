/*
 * 1) Declare an array
2) insert values into array
3) Find size of an array
4) read values from an array
 */
public class SingleDimArrayDemo {

	public static void main(String[] args) {
		
		/*int a[]=new int[5]; //1 declaration
		
		//2) insert values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[]= {100,200,300,400,500,600};//Declare an array without specifying size
		
		System.out.println(a.length); //size of array
		
		System.out.println(a[4]); //reading single value form array
		
		//classic for loop
		/*for(int i=0;i<=a.length-1;i++)  //5
		{
			System.out.println(a[i]);//100 200 300 400 500
		}*/
		
		//for..each loop/enhanced for loop
		
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}

}







