package StringBased;

public class inputthisOutput {

	
	public static void m1(String email)
	{    String letter="" ;
	     String numbers="" ;
		
		for(int i=0;i<=email.length()-1;i++)
		{   try {
			Integer.parseInt(email.valueOf(email.charAt(i)));
			numbers+=email.charAt(i);
		}
		catch (Exception e) {
			letter+=email.charAt(i);
		}
			
			
		}
		System.out.println("the letter " +letter);
		System.out.println("the number " +numbers);
	
	}
	

	public static void main(String[] args) { 
		String email="koushikvs1223gmailcom"; 
         m1(email);
	}

}
