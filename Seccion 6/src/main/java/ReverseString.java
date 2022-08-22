public class ReverseString {

	public static void main(String[] args) {
		
		String s="selenium";
		
		int len=s.length(); //8
		
		String rev="";
		
		for(int i=len-1; i>=0;i--)//7 6 5  -1
		{
			rev=rev+s.charAt(i); //muineles
		}
		
		System.out.println(rev);

	}

}
