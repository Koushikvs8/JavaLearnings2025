package Oops.Polymorphism;

public class Action {

	public Action() {
		// TODO Auto-generated constructor stub
	}
	
	public void click()
	{
		System.out.println("Clicking the elements");
	} 
	public void scroll()
	{
		System.out.println("scrolled till mid of the page");
	}
	public void scroll(String element , int num)
	{     
		System.out.println("scrolled till end the page" );
	}
	public void scroll(int num , String element)
	{
		System.out.println("scrolled till the element ");
	}
	

	public static void main(String[] str)
	{
		Action action= new Action();
		action.scroll();
		action.scroll(0, null);
		action.scroll(null, 0);
		action =new Clicking();
		action.click();
	}
	
	
}
