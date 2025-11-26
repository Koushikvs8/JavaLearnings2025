package Oops.inheritance;

public class Driver {

	public static void main(String[] args)
	{
		Basepage basepage= new Basepage();
		System.out.println(basepage.clickButton); 
		basepage.click();
		ProdPage prodpage= new ProdPage();
		prodpage.takeScrteenshot();
		
		
		
		
	}
}
