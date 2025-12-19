package codingPracticedec19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Collection.Lists;

public class countTheEvenandOdd {

	public static void main(String[] args) {
		int[] num = { 12,23,4,5,12,1,4,6,890};
		List<Integer> evenNum= new ArrayList<Integer>();
		List<Integer> oddNum= new ArrayList<Integer>();
		int count=0;
	     for(int x: num)
	     {
	    	 if(x%2==0)
	    	 {   evenNum.add(x);
	    		 count++;
	    	 }
	    	 else
	    	 {
	    		 oddNum.add(x);
	    	 }
	     }
		System.out.println("the number count of even number is:"+ count +" "+ evenNum.size()+ evenNum);
		System.out.println("the number count of odd number is:"+ (num.length-count) +" "+ oddNum.size() + oddNum);
	}
}
