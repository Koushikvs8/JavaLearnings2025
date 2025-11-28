package arrays.ArraysCoading;

import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args)
	{
	
		int[] a = {1, 32, 4, 56, 67, 89, 100, 3445};
		Arrays.sort(a); // Must be sorted

		int target = 3445;
		int start = 0;
		int end = a.length - 1;
		boolean found = false;

		while(start <= end)
		{
		    int mid = (start + end) / 2;

		    if(a[mid] == target)
		    {
		        found = true;
		        break;
		    }
		    else if(a[mid] < target)
		    {
		        start = mid + 1;   // go RIGHT
		    }
		    else
		    {
		        end = mid - 1;     // go LEFT
		    }
		}

		if(found)
		    System.out.println("Element found!");
		else
		    System.out.println("Element not found");

	
}
}
