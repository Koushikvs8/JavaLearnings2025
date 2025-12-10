package StringBased;

public class palindromic {

	public static void m1(String name) // nov reversing
	{    int start=0;
	     int end =name.length()-1;
	     boolean flag=true;
	     while(start<end)
	     {
	    	 if(name.charAt(start)!=name.charAt(end))
	    	 {
	    		 flag=false;
	    	 }
	    	 start++;
	    	 end--;
	    	 
	     }
		
	     if(flag)
	     {
	    	 System.out.println("palindrom");
	     }
	     else
	     {
	    	 System.out.println("not palindrom");
	     }
		
		
		
	}
	public static void m2(String name) // nov reversing
	{    String rev="";
	     boolean flag=true;
	     
	     for(int i=name.length()-1; i>=0; i--)
	     {     rev+=name.charAt(i);
	    	 
	     }
	    
		
	     if(rev.equals(name))
	     {
	    	 System.out.println("palindrom");
	     }
	     else
	     {
	    	 System.out.println("not palindrom");
	     }
		
		
		
	}
		
	public static void main(String [] args)
	{
		String name ="madam";
		m1(name);
		m2(name);
		
	}

}
