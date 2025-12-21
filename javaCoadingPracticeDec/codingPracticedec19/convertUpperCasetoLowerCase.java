package codingPracticedec19;

import java.util.Arrays;

public class convertUpperCasetoLowerCase {

	
	public static void main(String[] args) {
		String name="KouSHIK";
		char[] letter =name.toCharArray();
		for(int i=0; i<letter.length; i++)
		{   
			if(Character.isLowerCase(letter[i]))
			{
				letter[i]=Character.toUpperCase(letter[i]);
			}
			
		}
		System.out.println(new String(letter));
	}
}
