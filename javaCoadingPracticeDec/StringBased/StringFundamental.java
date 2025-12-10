package StringBased;

public class StringFundamental {

	public static void main(String[] args)
	{
		char [] ch= {'k','o','u','s','h','i','k'};
		String sen="I Love India so MUCh";
		String name =new String(ch); 
		String name1="koushik";//immutable 
		String name2 =name;
		System.out.println("the name is :" +name1);
		System.out.println("the name is :" +name2);
		System.out.println(name2.equals(name));
		System.out.println(name.concat(name2));
		for(int i=sen.length()-1; i>=0; i--)
		{
			if(sen.charAt(i)==' ')
			{
				continue;
		   
			}
			
			 System.out.print(sen.charAt(i));
		}
		System.out.println("\n"+sen.replaceAll("\\s+", ""));
				
		
		
		
		
	}

}
