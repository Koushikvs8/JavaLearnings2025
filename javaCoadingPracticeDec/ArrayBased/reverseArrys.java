package ArrayBased;

import java.util.Arrays;

public class reverseArrys {

	public reverseArrys() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	int[] a1= {1,2,3,4,5,6};
	int[] a2=new int[a1.length];
	int j=0;
	
	for(int i=a1.length-1; i>=0; i--) {
	{
		a2[j]=a1[i];
	     j++;
	}
	}
	System.out.println(Arrays.toString(a2));
}
}
