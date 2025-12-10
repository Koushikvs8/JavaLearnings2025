package StringBased;

public class reveseString {

	
	public static String m1(String sen)// reverse a string without using inbuilt methods
	{
		String rev="";
		for(int i=sen.length()-1;i>=0;i--)
		{
			rev+= sen.charAt(i);
			
		}
		
		System.out.println("the reversed string is :"+ rev);
		return rev;
	}
	
	public static void m2(String sen)// a string without using inbuilt methods ultrtnate
	{     
		
		  char[] ch = sen.toCharArray();
		   String rev="";
		
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}
		
		System.out.println("the reversed string is :"+ rev);
	}
	
	public static void m3(String sen)// reverse a string with built in method
	{     
		StringBuilder builder =new StringBuilder(sen);
		
       System.out.print("the reversed string is :"+ builder.reverse());
	}
	
	public static void m4(String sen)// reverse the words output:MUcH so InDiA .....
	{    
	   String[] senupdated=sen.split(" ");
	   
	   String result="";
	   

		for(int i=senupdated.length-1;i>=0; i--)
		{   
			result=result+senupdated[i]+ " ";
			
		}
		System.out.println(" reverse the word :"+ result );
     
	}
	
	public static void m5(String sen)// reverse the words output:AiDnI os HcUM.....
	{    
	   String[] senupdated=sen.split(" ");
	  
	  
	   StringBuilder result= new StringBuilder();

		for(String x:senupdated)
		{   
		   StringBuilder revBuilder=new  StringBuilder(x);
		   
		   result.append(revBuilder.reverse().append(" "));
		   
		   
		}
		System.out.print(" reverse the word :"+ result );
     
	}
	
	public static void m6(String sen)// reverse the without using builder method  output:AiDnI os HcUM.....
	{    
	   String[] senupdated=sen.split(" ");
	  String result ="";
	

		for(String x:senupdated)
		{   
			result =result+m1(x) +" ";
		  
		   
		}
		System.out.println(" reverse the word :"+ result );
     
	}
	
	public static void m7(String sen)// reverse the only choose word I loVE yM< InDIA so MUcH..
	{    
	   String[] senupdated=sen.split(" ");
	   StringBuilder result =new StringBuilder();
	  for(String x: senupdated)
	  {
		  if(x.equals("InDIA"))
		  {  StringBuilder rev =new StringBuilder(x);
		    
		     result.append(rev.reverse()+" ");
		  }
		  else
		  {
			  result.append(x+" ");
		  }
		  
		
		  System.out.println("the partail reverse is :"+ result);
		  
	  }
     
	}
	public static void main(String[] args)
	{
		String sen="I loVE My InDIA so MUcH";
		m1(sen);
		m2(sen);
		m3(sen);
		m4(sen);
		m5(sen);
		m6(sen);
		m7(sen);
		
	}

}
