package ExeceptionHandling;

public class Throw {
	
	
	public static void throwme()
	{
		try {
		throw new ArithmeticException(" the execption is on arthematic");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void throwme1() throws ArithmeticException, InterruptedException
	{
		
		Thread.sleep(null);
	}
	
	public static void helper() throws InterruptedException
	{
		throwme1();
	}
public static void main(String[] args)
{
	throwme();
}
}
