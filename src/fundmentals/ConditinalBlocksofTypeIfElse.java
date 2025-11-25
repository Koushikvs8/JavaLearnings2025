package fundmentals;

import java.util.Scanner;

public class ConditinalBlocksofTypeIfElse {

	public static void main (String[] koushik)
	{   
	 while(true) {
	   System.out.println("Enter your good Name");
	   Scanner input= new Scanner(System.in);
	   String name=input.nextLine();
	   if(name.isEmpty())
	   {
		   System.out.println("The name should not be empty"); 
	   }
	   else {
	   System.out.println("Enter your age");
	   int age=input.nextInt();
	   System.out.println("The entered Name : " +name +" The entered age : " + age);
	   try {
		   System.out.println("Please waite for a momment we are fetching your information");
		   Thread.sleep(2000);
	   }
	   catch (Exception e) {
	System.out.println("error :"+ e.getMessage());

	}
	
			if(age<18 || age>32)
			{
				System.out.println("sorry you are not eligible to write this exam");
			}
			else
			{
				System.out.println("Congradulations you are eligible to write the exam");
			}
			System.out.println("/ ************************************************* /");
	 
	   
	 }

	  
	 }
		
	}
}
