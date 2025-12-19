package numberBased;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		boolean isprime=true;
		if(num<=1)
		{
			isprime=false;
		}{
			for (int i = 2; i <= num / 2; i++) {
			    if (num % i == 0) {
			    	isprime = false;
			        break;
			    }
			}
	}
		if(isprime)
		{
			System.out.println(" prime number");
		}
		else
		{
			System.out.println(" NOT prime number");
		}

}
}