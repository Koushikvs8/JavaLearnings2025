package fundmentals;

import java.util.Scanner;

public class ConditinalBlockofTypeSwitch {


	
	
	public static void main(String[] koushik)
	{  	System.out.println("Enter the browser name where the selenium script has to execute");
		Scanner input=new Scanner(System.in);
		String browser=input.nextLine();
		
		int version=1;
		switch(browser) {
		case "chrome" :
			System.out.println("Chrome is opened ");
			break;
		
		case "firefox" :
			System.out.println("Firfox is opened ");
			break;
			
		case "edge" :
			System.out.println("Edge is opened ");
			break;
		default :
		throw new IllegalArgumentException("Invalid browser"+ browser);
		
		}
		
		switch(version)
		{
		case 1: System.out.println("the first version of framework");
		break;
		case 2: System.out.println("the secound version of framwork");
		break;
		default :
			throw new IllegalArgumentException("Unavailable verison please review back your veersion"+version);
		}
		
		
		
		
		System.out.println("Enter the browser name where the selenium script has to execute");
		
		
		
	}

}
