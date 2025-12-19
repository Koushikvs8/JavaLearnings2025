package numberBased;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		while(true) {
		System.out.println(" En the number ");
		Scanner input=new Scanner(System.in);
	     int num=input.nextInt();
		if(num%2==0)
		{
			System.out.println(" the number is even");
		}else
		{
			System.out.println(" the number is odd");
		}
	}
	}
}
