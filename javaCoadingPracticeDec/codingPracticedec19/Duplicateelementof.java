package codingPracticedec19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicateelementof {

	
	public static void main(String[] args) {
		int[] num = { 1,2,3,4,1,2,3,5,5,5,6,67,23,123,123};
		Map<Integer ,Integer> numpair= new HashMap<Integer, Integer>();
		for(int i=0; i<num.length; i++)
		{   
			if(numpair.containsKey(num[i]))
			{
				numpair.put(num[i], numpair.get(num[i])+1);
			}
			else
			{
				numpair.put(num[i], 1);
			}
				
		}
	   
		Set<Integer> keys= numpair.keySet();
		
		
		for(Integer x: keys)
		{
			if(numpair.get(x)>1) {
			System.out.println(x +" >" +numpair.get(x));
			}
		}
		
	}
}
