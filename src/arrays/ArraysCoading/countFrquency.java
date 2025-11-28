package arrays.ArraysCoading;

import java.util.Iterator;

public class countFrquency {

	
	public static void main(String[] args)
	{
		int[] a= {1,3,1,4,5,63,1,4};
		 boolean visited[] = new boolean[a.length];
		for (int i=0; i<a.length; i++) {
            
             if (visited[i] == true) 
                 continue;
             
             int count =1;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{  visited[j] =true;
					count++;
				}
				
			}
			System.out.println(a[i] +" count > "+ count );
		}
	}
}
