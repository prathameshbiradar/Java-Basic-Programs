package task1;

public class String_Programs {

	public static void main(String[]args)
	{
//		char[] ch = {'r','u','p','e','s','h'};
//		 String name1 = new String(ch);
//		 System.out.println(name1);
//		 String name = new String("rupesh");
//		 System.out.println(name);
		 String s ="rupesh";
		 System.out.println(s);
		 String p = "Rupesh";
		 System.out.println(p);
		 
		 //length of string
		 
		 int length = s.length();
		 System.out.println("Length of string is: "+length);
		char c = s.charAt(4);
		System.out.println("char at 4th index is: "+c);
		String substring1 = s.substring(1, 4);
		System.out.println("Substring of string is: "+substring1);
		
		boolean isContain = s.contains("a");
		System.out.println("is this word contains in string: "+isContain);
		
		if(s.equals(p))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		if(s.equalsIgnoreCase(p))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		System.out.println(p.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.startsWith("r"));
		System.out.println(s.endsWith("h"));
		
		int a =10;
		String r = String.valueOf(a);
		System.out.println(r+10);
		
		String age = "Enter your age";
		char[] ch = age.toCharArray();
		for(char c1 :ch )
		{
			System.out.print(c1+",");
		}
		System.out.println();
		
		char[]age1 = {'a','k','a','s','h'};
		String age3 = age1.toString();
		System.out.println(age3);
	}
}
