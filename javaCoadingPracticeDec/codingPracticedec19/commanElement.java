package codingPracticedec19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class commanElement {


	private static void m2(int[] a, int[] b) {
	
		Set<Integer> a1=new HashSet<Integer>();
		Set<Integer> a2=new HashSet<Integer>();
		
		for (Integer integer1 : a) {
			a1.add(integer1);
		}
		for (Integer integer2 : b) {
			a2.add(integer2);
		}
		
		for(Integer x :a1)
		{
			if(a2.contains(x))
			{
				System.out.println("the comman element is :"+ x);
			}
		}
		
		
		
	}

	private static void m1(int[] a, int[] b) {
		System.out.println(" the common elements :");
		for (int i = 0; i < b.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
					
				}
			
			
			}}
		
	}
		
		public static void main(String[] args) {
			int[] a= {1,2,3,4,5,6,7};
			int[] b= {1,2,8,9,10};
			m1(a ,b);
			m2(a ,b);
			

		}
}