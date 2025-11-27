package Strings;

public class StringMethods {

	static String name= "we are here to create new  revalution   ";

	public static void main(String[] args)
	{
		System.out.println("the string :"+name);
		System.out.println("the string :"+name.length());
		System.out.println("the string :"+name.charAt(4));
		System.out.println("the string :"+name.toUpperCase());
		System.out.println("the string :"+name.toLowerCase());
		System.out.println("the string :"+name.trim());
		System.out.println("the string :"+name.equals("we "));
		System.out.println("the string :"+name.contains("here"));
		System.out.println("the string :"+name.indexOf("here"));
		System.out.println("the string :"+name.substring(4)+name.substring(0,5));
		System.out.println("the string :"+name.replace("revalution", "gym"));
		System.out.println("the string :"+name.join("/", "gym", "go"));
	
		
	}
	

}
