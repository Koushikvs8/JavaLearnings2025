package StringBased;

public class doublingcahar {

	public static void main(String [] args) {
	String name="kousshik";
	String result ="";
	
	for(char c:name.toCharArray())
	{
		Character character='s';
		result+=c+""+c;
	}
	System.out.println(result);
	}
}
