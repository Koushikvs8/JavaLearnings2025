package codingPracticedec19;

public class largestNum {

	public static void main(String[] args) {
		int num[] = { 12,23,12,45,1,23,456};
	    int max=num[0];
	    for(int i=1; i<num.length; i++)
	    {
	    	if(num[i]>max)
	    	{
	    		max=num[i];
	    	}
	    
	    }
       System.out.println("the largest number is :"+max);
	}

}
