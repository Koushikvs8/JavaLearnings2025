package StringBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheCountVowels {
	
	public static void m1(String sen) //find the count of vowels
	{
		sen.toCharArray();
		int count=0;
		for(  char ch :sen.toCharArray())
		{    if("aeiou".indexOf(ch)!=-1)
		{
			count++;
		}
			
		}
		System.out.println("the count of vowels :"+ count);
		
		
	}
	
	public static void m2(String sen)// output a=1,e=2,i=2
	{    int sum=0;
		int acount=0;
		int ecount=0;
		int icount=0;
		int ocount=0;
		int ucount=0;
		  
		for(char ch :sen.toCharArray())
		{
			switch(ch)
			{  case 'a': acount++;
			break;
			case 'e': ecount++;
			break;
			case 'i': icount++;
			break;
			case 'o': ocount++;
			break;
			case 'u': ucount++;
			break;
			}
		}
		
	
		System.out.println("a  count  >"+acount);
		System.out.println("e  count  >"+ecount);
		System.out.println("i  count  >"+icount);
		System.out.println("o  count  >"+ocount);
		System.out.println("u  count  >"+ucount);

		
	
	}
	
	public static void m3(String sen)
	{    
	     Map<Character, Integer> chCount=new HashMap<Character, Integer>();
	     
	     
	     for (char ch : sen.toCharArray())
	     {
	    	 if("aeiou".indexOf(ch)!=-1)
	    	 {
	    		 chCount.put(ch,chCount.getOrDefault(ch, 0)+1 );
	    	 }
	     }
	     
		
	     for(char v: "aeiou".toCharArray())
	     {
			System.out.println(v +" >" + chCount.get(v));
	     }
		
		
	}

	public static void main (String[] args)
	{
		String sen="I Love MY INdia So MuCh";
		sen.toLowerCase();
		m1(sen.toLowerCase());
		m2(sen.toLowerCase());
		m3(sen.toLowerCase());
	}

}
