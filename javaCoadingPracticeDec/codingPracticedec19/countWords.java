package codingPracticedec19;

public class countWords {

	
	
	public static void main(String[] args) {
		String sen ="the koushik is sdet definitly one day";
	    String[] words= sen.split("\\s+");
	    int count=0;
	      for( String x:words)
	      {
	    	  count++;
	      }
	    
	    
	     System.out.println(sen.split("\\s+").length + " the count of the words are " + count);
	}
}
