package Oops;

public class Employee {
	
	String Name;
	int loginTime;

	public Employee(String Name , int loginTime) {
		this.Name =Name;
		this.loginTime=loginTime;
	

	}
	
	public void scheduleTime()
	{
		ServiceProvider sp= new ServiceProvider();
		sp.checkAvalibility(this);
	}
	
    public static void main(String[] args)
    {
    	Employee em1 = new Employee("KOUSHIK", 12);
    	Employee em2 = new Employee("SWATHI", 7);
    	Employee em3 = new Employee("TAKSH", 6);
    	Employee em4 = new Employee("SOWMYA", 3);
    	 em1.scheduleTime();
         em2.scheduleTime();
         em3.scheduleTime();
         em4.scheduleTime();
    }
	

}
