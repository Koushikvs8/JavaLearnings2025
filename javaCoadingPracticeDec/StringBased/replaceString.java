package StringBased;

public class replaceString {

	
	public static void main(String[]args)
	{     String name="Koushik @#$%1  23  4    567";
	      System.out.println(name.replace("K", "s"));
	      System.out.println(name.replaceAll("\\d", "."));
	      System.out.println(name.replaceAll("\\s", ""));
	      System.out.println(name.replaceAll("[^a-zA-Z]", ""));
	      System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
		
	}

}
