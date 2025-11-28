package arrays.ArraysCoading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestElement {

	public static void firstLargest(int[] a)
	{
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("the largest number :"+max);
	}
	
	public static void secoundLargestSortMethod(int[] a)
	{
	    Arrays.sort(a);
	    int secLargest=0;
	    int an=a.length;
	    for(int i=an-2; i>=0; i--)
	    {
	    	if(a[i]!=a[an-1])
	    	{
	    		secLargest=a[i];
	    		break;
	    	}
	    }
		System.out.println("the largest number :"+secLargest);
	}
	
	public static void secoundLargestAlgorithamBased(int[] a)
	{
		int max1=0;
		int max2=0;
		
		if(a[0]>a[1])
		{
			max1=a[0];
			max2=a[1];
		}
		else
		{   max1=a[1];
			max2=a[0];
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>max1)
			{   max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
			
				
		}
		System.out.println("the largest number :"+max2);
	}
	
public static void main(String[] args)
{
	int [] arr= {12,34,11,56,78,99,890,1};
	firstLargest(arr);
	secoundLargestSortMethod(arr);
	secoundLargestAlgorithamBased(arr);
}
}
