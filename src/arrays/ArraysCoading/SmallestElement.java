package arrays.ArraysCoading;

public class SmallestElement {

public static void main(String[] args)
{
	int[] a= { 12,34,1,34,567,876,90};
	int min=a[0];
	
	for(int i=1; i<a.length; i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("the smallest element :"+ min);
}
}
