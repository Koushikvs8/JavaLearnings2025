package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Maps {
public static void main(String[]args)
{
	
	HashMap<Integer, String> student= new HashMap<Integer, String>();
	student.put(101, "Koushik");
	student.put(102, "Swathi");
	student.put(103, "vishwa");
	student.put(104, "Kavya");
	student.put(null, "Kavya");
	System.out.println(student.keySet());
	System.out.println(student.values());
	System.out.println(student.remove(null));
	System.out.println("Employee with ID 102: " + student.get(102));
	
	Set<Integer> keys=student.keySet();
	
	Iterator<Integer> it =keys.iterator();
	
	while(it.hasNext())
	{
		System.out.println(student.get(it.next()));
	}
	
for(Map.Entry<Integer,String> entry :student.entrySet())
	System.out.println("Keys :"+entry.getKey() +" Value :" +entry.getValue());
{
	
}
	
	
	
}
}
