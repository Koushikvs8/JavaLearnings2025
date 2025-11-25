package fundmentals;

public class WorkAround {

	
	
	public WorkAround() {
		// TODO Auto-generated constructor stub
	}

	
	public void instanceMethod1() {
		
	}
	
public void instanceMethod2() {
	instanceMethod1();
	}
	
	
	public static void  staticMethod1()
	{
		staticMethod2();
	}
	public static void  staticMethod2()
	{
		
	}
}
