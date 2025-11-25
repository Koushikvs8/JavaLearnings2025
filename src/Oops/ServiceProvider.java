package Oops;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider {
      
	int[] timings = { 12,1,2,3,4,5};
	boolean isavailable=false;
	
	
	public void checkAvalibility(Employee em)
	{
		for(int time :timings)
		{
			if(em.loginTime==time)
			{
				isavailable=true;
			}
		
	}
		if(isavailable)
		{
			System.out.println("Employee name: "+ em.Name+"the login is available at ;"+em.loginTime);
	}
		else
		{
			
			System.out.println("Employee name: "+ em.Name+"the login is noT available at ;"+em.loginTime);
		}

	}
}
