package codingPracticedec19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	
	public static void main(String[] args) {
		int[] num= {22,33,1,2,33,22,56,21,67,2};
	    int[] uniqueElements=removeDupliacate(num);
	    System.out.println(Arrays.toString(uniqueElements));
		
	}

	private static int[] removeDupliacate(int[] num) {
		int j=0;
		Set<Integer> x=new HashSet<Integer>();
		 for(Integer y : num)
		 {
			 x.add(y);
		 }
		 int[] result =new int[x.size()];
		   for(Integer f: x )
		   {   
			  result[j]=f;
			   j++;
		   }
		
		return result;
	}
}
