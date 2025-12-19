package ArrayBased;

public class simpleTriaglepattern {

public static void main(String[] args)
{     int[] num= {1,2,3,4,5};

/*1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5*/
	for(int i=0; i<num.length; i++)
	{
		for(int j=0; j<=i; j++)
		{
			
			System.out.print(num[j] );
		}
		System.out.print("\n");
	}
	
	
}

}
