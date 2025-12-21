package codingPracticedec19;

import java.util.Arrays;

public class reverseStrimg {

	public static void main(String[] args) {
		String name ="koushik Love INdia SO Much";
		char[] ch= name.toCharArray();
		String rev="";
		String rev1="";
		String[] word=name.split("\\s+");
		String rev3="";
		String rev2=""+rev3;
		
		
	  for (int i = name.length()-1; i >=0; i--) {
		 
		  rev=rev+name.charAt(i);
		  rev1=rev+ch[i];
	}
	  
	  for (int i = word.length-1; i >=0; i--) {
		  if((word[i].equals("koushik")))
		  {
			  for (int j = word[i].length()-1; j >=0; j--) {
				  
				  rev3=rev3+word[i].charAt(i);
			}
			  System.out.println(rev3);
		  }
		  
		  else
		  {
		  rev2=rev2+word[i] + " ";
		  }
	}
	  
	  System.out.println(rev  +"   > . > alter nate method;  " +rev1);
	  System.out.println("reveers the word " +rev2);
	}
	
	
}
