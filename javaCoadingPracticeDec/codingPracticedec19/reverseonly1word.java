package codingPracticedec19;

public class reverseonly1word {

	
	public static void main(String[] args) {
		String sen =" we all love koushik";
		String[] word=sen.trim().split("\\s+");
		String result="";
		
		
		for(String x :word)
		{if(true)
		{
			for (int i=x.length()-1;i>=0; i--) {
				result=result+x.charAt(i);
			}
		}
		//else
	//	{
		//	result=result+x;
	//	}
			result=result+" ";
		}
		System.out.println(result.trim());
	}
}
