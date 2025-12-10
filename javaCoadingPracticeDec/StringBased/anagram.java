package StringBased;

import java.util.Arrays;

public class anagram {

	
	public static void m1(String s1, String s2)
	{   char[] a=s1.toCharArray();
	    char[] b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b))
		{
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
	}
	
	
	public static void main(String[] args)
	{
		String s1="koushik";
		String s2="koukchis";
		m1(s1,s2);
		
	}

}
