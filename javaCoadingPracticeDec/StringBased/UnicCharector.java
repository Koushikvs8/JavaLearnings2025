package StringBased;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnicCharector {

	public static void main(String[] args)
	{
		String sen="java Automation Test".replaceAll(" ", "");
		Set<Character> chunic=new LinkedHashSet<Character>();
		String join="";
		for(char ch: sen.toCharArray())
		{
			chunic.add(ch);
		}
		  
		
		
		for (Character c: chunic)
		{
			join+=c;
		}
		System.out.println(join );
	}}

