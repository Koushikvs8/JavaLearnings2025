package ArrayBased;

public class smallestelement {

	

	public static void main(String[] args) {
		int[] num= {1,34,456,4,6,7};
		int min=num[0];
		
		for(int i=0; i<num.length; i++)
		{
			  if(num[i]<min)
			  {
				  min =num[i];
			  }
			
		}
    System.out.println("the smallest number is :" + min);
	}

}
