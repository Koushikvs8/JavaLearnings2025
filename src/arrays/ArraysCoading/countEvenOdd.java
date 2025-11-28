package arrays.ArraysCoading;

public class countEvenOdd {

	public static void main(String[] args) {
		int[] a= { 2,3,4,5,6,7,8,90,56,34};
		int count =0;
		for(int a1:a)
		{
			
			if(a1%2==0)
			{
				count++;
			}
			
		}

		System.out.println("number of even numbers"+count);
		System.out.println("number of add numbers "+(a.length-count));
	}

}
