package codingPracticedec19;

import java.util.Arrays;

public class secoundLargest {

	public static void main(String[] args) {
		int[] num= {1,90,1,2,34,45,12,56,78,90,123,123};
		m1(num);
		m2(num);

	}

	private static void m2(int[] num) {
		Arrays.sort(num);
		int[] sorted=num;
		int a2=sorted.length-2;
		int large2=0;
	for(int i=a2; i>=0;i--)
	{
		if(sorted[i]!=sorted[sorted.length-1])
		{
			large2=sorted[i];
			break;
		}
		
	}
	System.out.println("secount largest element is" +large2);
	}

	public static void m1(int[] num) {
		
		
	}

}
