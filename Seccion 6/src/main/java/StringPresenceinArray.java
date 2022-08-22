public class StringPresenceinArray {

	public static void main(String[] args) {
		
		String a[]= {"abc","xyz","pqr","dfg"};
		
		String value="kkkk";
		
		boolean flag=false;
		
		for(String i:a)
		{
			if(i.equals(value))
			{
				System.out.println("Elemenent found");
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
