package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopsforListset {
	
	
	static void normalLoop(List<String> name)
	{
		for (int i=0; i<name.size(); i++)
		{
			System.out.print(name.get(i)+" ");
		}
		System.out.print("\n" );
	}
	
	static void forEach(List<String> name)
	{
		for (String x:name)
		{
			System.out.print(x+" ");
		}
		System.out.print("\n" );
	
	}
	
	static void iteratorLoop(List<String> name)
	{
	Iterator<String> itr =name.iterator();
	
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	
	}
	

	public static void main(String[] args)
	{
		String[] names= {"koushik","swathi","naveen","nikil","aishwarya"};
		List<String> name =new ArrayList<String>(Arrays.asList(names));
		normalLoop(name);
		forEach(name);
		iteratorLoop(name);
	}
}
