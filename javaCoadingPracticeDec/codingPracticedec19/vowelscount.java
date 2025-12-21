package codingPracticedec19;

public class vowelscount {

	
	public static void main(String[] args) {
		String word="available";
		char[] ch=word.toCharArray();
		int vowelcount=0;
	for(int i=0; i<ch.length; i++)
	{   
		if("aeiou".indexOf(ch[i])!=-1)
		{
			
			vowelcount++;
		}
		
	}
	System.out.println(" the vowel count >: " + vowelcount);
	System.out.println(" the consonenets count >: " +(ch.length- vowelcount));
	}
}
