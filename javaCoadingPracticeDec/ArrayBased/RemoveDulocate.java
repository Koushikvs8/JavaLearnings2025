package ArrayBased;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDulocate {

	public static void m1(int[] b)
	{
	    int[] temp = new int[b.length];
	    int index = 0;

	    for (int i = 0; i < b.length; i++) {

	        boolean seen = false;

	        // check in temp array (0 to index-1)
	        for (int j = 0; j < index; j++) {
	            if (b[i] == temp[j]) {
	                seen = true;
	                break;
	            }
	        }

	        if (!seen) {
	            temp[index] = b[i];
	            index++;
	        }
	    }

	    int[] result = Arrays.copyOf(temp, index);
	    System.out.println("The unduplicated version: " + Arrays.toString(result));
	}
	   
	
	
	
	
public static void main(String[] args) {
	Integer[] a= {23,23,4,5,4,6,6,7,67,87};
	
   Set<Integer> num=new  HashSet<Integer>(Arrays.asList(a));
    System.out.println(num);
    int[] b= {23,23,4,5,4,6,6,7,67,87};
m1(b);
}
}
