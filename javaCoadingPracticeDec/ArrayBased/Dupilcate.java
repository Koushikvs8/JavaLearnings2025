package ArrayBased;

public class Dupilcate {

	  public static void m1(int[] a)   //array based
	  {
		  for (int i = 0; i < a.length; i++) {
			  boolean duplicated=false;
			  int count=0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
					duplicated=true;
					
				}
				
				
			}
			if(duplicated)
			{
				System.out.println(" the dupcate element :" +a[i]);
			}
			
			
		}
		  
		  
		  
	  }
	
	

public static void main(String[] args) {
	
	int[] num = { 1,2,2,1,1,3,4,5,6,7,55,33,33};
	
	 m1(num);
}
}
