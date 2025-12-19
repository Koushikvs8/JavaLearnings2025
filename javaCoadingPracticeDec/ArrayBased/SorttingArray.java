package ArrayBased;

import java.util.Arrays;

public class SorttingArray {

	public static void main(String[] args) {
		int[] a= {23,34,21,456,3,54,23,678,1,3,2,1};
        int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				    if(a[j]>a[j+1])
				    {
				           temp =a[j];
				          a[j+1]=a[j];
				          a[j]=temp;
				    	
				    }
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
