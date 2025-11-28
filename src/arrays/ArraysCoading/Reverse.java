package arrays.ArraysCoading;

public class Reverse {
 
	public static void reverseWorkaround(int[] a)
	{
		int[] b=new int[a.length];
		int j=0;
		for(int i=a.length-1; i>=0; i--) 
		{
			b[j]=a[i];
			j++;
		}
		looper(b);
		
	}
	
	
	public static void looper(int[] x)
	{
		for(int a1:x)
		{
			System.out.print(a1 + " ");
			
		}
		System.out.println("");
	}
	
	public static void reverseSmart(int[] a)
	{    int a0=0;
	     int an=a.length-1;
	     int temp;
	     while(a0<an)
	     {
	    	 temp= a[a0];
	    	 a[a0]=a[an];
	    	 a[an]=temp;
	    	 a0++; an--;
	    	
	     }
		looper(a);
	}
	
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		reverseWorkaround(a);
		reverseSmart(a);
		
		

	}

}
