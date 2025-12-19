package ArrayBased;

import java.util.Arrays;

public class countTheEvenAndodd {

	public static void main(String[] args) {
		int[] a= {12,34,56,2,4,6,9,7};
		int count=0;
		int[] even = new int[a.length];
		int i=0;
		 for(int b:a)
		 {   if(b%2==0)
		 {   even[i++]=b;
			 count++;
		 } 
		 }
		 System.out.println(" the even count:"+count +" the odd count :"+ ((a.length)-count));
		 System.out.println(" the even elements are :"+ Arrays.toString(even));
		
		
	}

}
