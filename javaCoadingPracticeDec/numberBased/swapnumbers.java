package numberBased;

public class swapnumbers {
    
	public static void m1(int a, int b)//swap number without using 3rd variable
	{   a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println(" the swaped "+ " a: "+a+" b:"+ b);
		
	}
	
	public static void m2(int a, int b )//swap number with using 3rd variable
	{    int temp=a;
	     a=b;
	     b=temp;
	     System.out.println(" the swaped "+ " a: "+a+" b:"+ b);
	}
	
	
	public static void main(String[] args) {
		int a=20;
		int b=30;
		m1(a,b);
		m2(a,b);
	}

}
