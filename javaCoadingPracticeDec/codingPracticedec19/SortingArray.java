package codingPracticedec19;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int[] a= {1,2,34,12,45,1,54,123,12};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1])
				{    
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println("the sorted element is :"+ Arrays.toString(a) + "and secound largest is "+ a[a.length-2]);
	}
	
}
