package Collection;

import java.util.*;

public class Lists {
	
	static List<Object> randomObjects()
	{      List randomdata=new ArrayList();
	     randomdata.add("koushik");
	     randomdata.add(" ");
	     randomdata.add(null);
	     randomdata.add(23);
	     randomdata.add('e');
	     
	     
		
		return randomdata;
	}
	
	
public static void main(String[] args)
{   
	List r=randomObjects();
	String[] name= {"swathi","sowmya","nandhitha"};
	List<String> names=new ArrayList<String>(Arrays.asList(name));
	System.out.println(names);
			System.out.println(r.addAll(names));
			System.out.println(r);
			System.out.println(r.reversed());
			System.out.println(r.set(0, "kallesh"));
			System.out.println(r.reversed());
			System.out.println(r.indexOf("sowmya"));
			System.out.println(r.size());
			System.out.println(r.remove(" "));
			System.out.println(r.add("23"));
			System.out.println(r);
			
		
}
}
