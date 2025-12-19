package ArrayBased;

import java.util.Arrays;
import java.util.Iterator;

public class largestElement {

	
	public static void largestElment(int[] a)
	{
		int max=a[0];
		
	for(int i=1; i<=a.length-1; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
		
		System.out.println("the largest number of an array is :"+ max);
	}
	
	

	public static void main(String[] args) {
		int[] a= {23,34,57,56,78,90,12,34,56,67};
		largestElment(a);
		secoundlargestElment(a);
	}



	private static void secoundlargestElment(int[] a) {
		Arrays.sort(a);
		int a1max=a.length;
	    int a2max=0;
	    for(int i=a1max-2;i>=0; i--)
	    {
	    	if(a[i]!=a[a1max-1])
	    	{
	    		a2max=a[i];
	    		break;
	    	}
	    }
		System.out.println("the scound largest element is" + a2max);
	}

}
