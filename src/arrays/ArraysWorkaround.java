package arrays;

public class ArraysWorkaround {

	
	
	public static void main(String[] args)
	{
		int[] a = {12 ,12,45,56,76,90};
		int[] b = new int[100];
		b[0]=234;
		b[1]=344;
		b[2]=345;
		System.out.println(b[1] +" / "+b[2]);
		
		//printing the arrys
		
		for(int i=0; i<a.length; i++)
		{
			//System.out.println(" the "+ i +"element "+a[i]);
		}
		
		//printing arry using for each
		for (int num: b)
		{  if(num!=0)
		{
			System.out.println(num);
		    
		}
		else
		{
			System.out.println("the invalid values ");
			break;
		}
		}
	}

}
