package codingPracticedec19;

import java.util.Arrays;

public class ArrayFundamental {
	  static int[] num= {1,3,4,5,6,7,8,8,9,10};
	  static String[] students= {"koushik","swarthi", "vaishnvi","siddharth"};
	  static String[] name= new String[students.length];
	  static int j=students.length-1;
	

	public static void main(String[] args) {
		System.out.println(num.length);
       System.out.println(num[2]);
       for(int i=0; i<students.length; i++)
 	  {
    	name[j]=students[i];
    	j--;
    	
 	  }
       System.out.println(Arrays.toString(name));
	}

}
