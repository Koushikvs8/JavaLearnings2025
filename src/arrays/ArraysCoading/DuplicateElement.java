package arrays.ArraysCoading;

public class DuplicateElement {

	public static void main(String[] main)
	{
		int [] a= {12,34,12,56,34,55,78,90,9,78,9};
		
		for(int i=0; i<a.length; i++)
		{
			boolean flag=false;
			for(int j=i+1;j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println("the Element :"+ a[i] + " duplicated");
			}
			
		}
		
	}
}
