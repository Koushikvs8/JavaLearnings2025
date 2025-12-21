package codingPracticedec19;

public class StringBuilderPrgrams {

	public static void main(String[] args) {
		String sen ="koushik is good boy";
		reversethesen(sen);
		reversetheword(sen);

	}

	private static void reversetheword(String sen) {
		String[] word= sen.split("\\s+");
		StringBuilder  result=new StringBuilder();
		for(int i=word.length-1;i>=0; i--)
		{   if(word[i].equals("good")) 
		   {
			StringBuilder  rev=new StringBuilder(word[i]);
			 result.append(rev.reverse()).append(" ");
		   }
		else
		{
			
			result.append(word[i]).append(" ");
		} 
		}
		System.out.println(result);
		
	}

	private static void reversethesen(String sen) {
		  StringBuilder  rev=new StringBuilder(sen);
		  System.out.println(rev.reverse());
		
	}

}
