package ExeceptionHandling.userDefinedExecption;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MYException {

	
	public static void main(String[] args)
	{
	while (true) {
		System.out.println("enter the element number");
		Scanner input=new Scanner(System.in);
		int element = input.nextInt();
		try {
		if(element==26)
		{
			System.out.println(" the valid element ");
		}
		else
		{
			throw new NosuchElementExecption("");
		}
		}
		catch (NosuchElementExecption e) {
			
			System.out.println("invalid element"+e);
			
		}
		
		
	}
	}
}
