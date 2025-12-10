package ExeceptionHandling;

public class RunTimeException {

	static void sleep() 
	{
	try {
		Thread.sleep(null);
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	System.out.println("////////////////////////");
	}
	
	static int arthematicE()
	{ int value = 0;
	 String a=null;
		try {
		 value=10/1;
		 a.length();
	}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	catch (Exception e) {
		System.out.println(e);
	}
		finally {
			System.out.println(value);
			System.out.println("////////////////////////");
			return value;
		}
		
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		sleep();
		arthematicE();
	}
}
