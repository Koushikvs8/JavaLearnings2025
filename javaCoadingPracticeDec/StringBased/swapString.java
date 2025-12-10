package StringBased;

public class swapString {

	public static void m1(String a , String b)//using 3rd variable
	{
		String temp=a;
		a=b;
		b=temp;
		System.out.println("the swaped version is :"+ a +" "+ b);
		
		
	}
	
	public static void m2(String a , String b)//without using 3rd variable 
	{
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("the swaped version is :"+ a +" "+ b);
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		String a="koushik";
		String b="shet";
		m1(a,b);
		m2(a,b);
		
		
		
	}

}
