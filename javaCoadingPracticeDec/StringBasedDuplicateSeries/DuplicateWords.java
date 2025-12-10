package StringBasedDuplicateSeries;

import java.util.Iterator;

public class DuplicateWords {
	
	
	public static void m1(String sen)  // count the number of words
	{              
		String[] words =sen.trim().split(" ");
		System.out.println("the number of words : "+(words.length));
		
	}
	public static void m2(String sen)  // count the number without inbuilt methods
	{  
		int count=1;
		for(int i=0; i<sen.length()-1;i++)
	{
		if(sen.trim().charAt(i)==' '&& sen.trim().charAt(i+1)!=' ')
		{
			count++;
		}
		
		
	}
		System.out.println("the count of words "+ count);
	}

	public static void main(String[] args)
	{
		String sen ="i Love java and Hate java some Time i";
		m1(sen);
		m2(sen);
		
	}

}
