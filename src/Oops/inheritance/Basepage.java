package Oops.inheritance;

public class Basepage {
// Locaters
	

	String clickButton = "div[@class='button']";
	
	public Basepage() {
		System.out.println("the base page constructer");
		// TODO Auto-generated constructor stub
	}
	
	//actions
	
	
public void click()
{
	System.out.println("the base page button is fixed");
}

public void takeScrteenshot()
{
	System.out.println("the base page screen shot has taken");
}
	

}
