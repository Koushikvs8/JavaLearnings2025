package numberBased;

public class LeapYear {

public static void main(String[] args) {
	int year=2028;
	
	if((year%4==0 && year%100!=0) ||( year%400==0))
	{
		System.out.println(" the yesr is leap");
	}
	else
	{
		System.out.println(" the yesr is not leap");
	}
		
}

}
