package Strings;

public class StringWorkaround {

	public static void main(String[] args)
	{
		String name = new String("koushik you can crack the interview");
		char[] ch= {'a','b','c','d'};
		int age =23;
		String name2 = new String(ch,1,3);
		System.out.println(name);
		System.out.println(name2+name);
		System.out.println(name2);
		
	}

}
