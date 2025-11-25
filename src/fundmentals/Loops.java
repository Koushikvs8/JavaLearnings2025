package fundmentals;

import java.util.Scanner;

public class Loops {

	public Loops() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{   int loopOption=2;
		System.out.println("Enter the number to print its mulple of first 10 number");
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		if(loopOption==1) {
			System.out.println("we are in for loop");
		for(int i =1 ; i<=10; i++)
		{   if(i%2!=0)
		{
			continue;
		}
			System.out.println(num +"*"+i+"="+num*i);
		}
		}
		else
		{
			int j=1;
			System.out.println("we are in do while loop");
	
			do
			{
				System.out.println(num +"*"+j+"="+num*j);
				
				j++;
			}while(j<=10);
			
		}
		
	}

}
