public class StringMethodsDemo {

	public static void main(String[] args) {
		
		
		String s="welcome";
				
		//length()
		System.out.println(s.length()); //7
		
		//concat()
		String s1="welcome";
		String s2="to java";
		
		System.out.println(s1+s2);
		System.out.println(s1+"  "+s2);
		System.out.println(s1.concat(s2));
		System.out.println("wecolme"+"to java");
		System.out.println("welcome".concat("to java"));
		
		//trim()
		
		s="     java programming         ";
		//System.out.println(s.length());
		System.out.println(s);
		
		System.out.println(s.trim());
		
		
		//charAt() - index will start from 0
		
		s="welcome";
		
		System.out.println(s.charAt(5)); //m
		System.out.println(s.charAt(0)); //w
		
		
		//contains() ---> retuns true/flase
		
		s="Welcome";
		
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("COME")); //false
		
		
		//equals()  --> returns true/false
		
		System.out.println(s.equals("Welcome")); //TRUE
		System.out.println(s.equals("welcome")); //false
		
		 //equalsignoreCase()
		
		System.out.println(s.equalsIgnoreCase("welcome")); //true
		
		
		//replace()
		
		s="Welcome to java Welcome to selenium";
		
		System.out.println(s.replace('o','z'));//Welczme tz java Welczme tz selenium
		
		System.out.println(s.replace("Welcome", "xyz")); //xyz to java xyz to selenium
		
		//substring()
		
		s="welcome";
		
		System.out.println(s.substring(0,3));//wel
		System.out.println(s.substring(4,7));//ome
		
		
		//toLowerCase()  & toUpperCase()
		
		s="WELcome";
		
		System.out.println(s.toLowerCase());//welcome
		
		System.out.println(s.toUpperCase());//WELCOME
		
		
	}

}














