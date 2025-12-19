package arrays.ArraysCoading;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
public static void main(String[] args) {
	

	 int[] a = {12, 34, 12, 12, 56, 34, 55, 78, 90, 9, 78, 9};
        int count=0;
	    Set<Integer> set = new HashSet<>();

	    for (int i = 0; i < a.length; i++)
	    {
	        boolean flag = false;

	        for (int j = i + 1; j < a.length; j++)
	        {
	            if (a[i] == a[j])
	            {  count++;
	                flag = true;
	                break;
	            }
	        }

	        if (flag && !set.contains(a[i]))
	        {
	            System.out.println("The element: " + a[i] );
	            set.add(a[i]);  // Add the element after printing once
	        }
	    }}
}
