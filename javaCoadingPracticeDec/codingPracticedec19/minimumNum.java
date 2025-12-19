package codingPracticedec19;

public class minimumNum {
	public static void main(String[] args) {
		int num[] = { 12,23,12,45,1,23,456};
	    int min=num[0];
	    for(int i=1; i<num.length; i++)
	    {
	    	if(num[i]<min)
	    	{
	    		min=num[i];
	    	}
	    
	    }
       System.out.println("the largest number is :"+min);
	}
}
