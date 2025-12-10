package StringBasedDuplicateSeries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DupicateCharecter {

	public static void m1(String sen)
	{
		
		Map<Character, Integer>  ch=new HashMap<Character, Integer>();
		for(int i=0; i<sen.length();i++)
		{
		   //  if(sen.charAt(i)==' ') {continue;}
			
				//ch.put(sen.charAt(i), ch.getOrDefault(sen.charAt(i), 0)+1);
			if(sen.charAt(i)==' ') {continue;}
			if(ch.containsKey(sen.charAt(i)))
			{
				ch.put(sen.charAt(i), ch.get(sen.charAt(i))+1);
			}
			else
			{
				
				ch.put(sen.charAt(i), 1);
			}

		}
		
		Set<Character> value =ch.keySet();
		System.out.println("the occurence of charecter");
		for (Character chi :value)
		{
			System.out.println(chi + " : >" + ch.get(chi));
		}
		
		
		System.out.println("the duplicate charecters");
		for (Character chi :value)
		{  if(ch.get(chi)>1)
		{
			System.out.println(chi + " : >" + ch.get(chi));
		}
		}
		
		System.out.println("the duplicate charecters");
		for (Map.Entry<Character, Integer> entry:ch.entrySet())
		{  if(entry.getValue()>1)
		{
			System.out.println(entry.getKey() + " : >" + entry.getValue());
		}
		
		}
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		String sen="java is java becouse is java is program to run java";
		m1(sen);
	//	m2(sen);
		
		
		
	}
}
