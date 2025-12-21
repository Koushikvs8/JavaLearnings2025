package codingPracticedec19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dupliacteCharecterOfString {

	
	public static void main(String[] args) {
		String sen="i love the the Llove the koushik koushik ";
		String[] words=sen.trim().split("\\s+");
		Map<String ,Integer> pairs= new HashMap<String, Integer>();
		for(String x : words)
		{
			if(pairs.containsKey(x))
			{
				pairs.put(x , pairs.get(x)+1);
			}
			else
			{
				pairs.put(x ,1);
			}
		}
		
		
		Set<String> keys= pairs.keySet();
	
		for(String x:keys)
		{
			
			if(pairs.get(x)>1)
			{
			System.out.println(x +" <. . .>"+ pairs.get(x));
			}
		}
		
		
	}
	
	
	
}
