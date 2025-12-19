package numberBased;

public class fiboniSeries {


   public static void main(String[] args) {
	  int num=10;
	  int a1=0;
	  int a2=1;
	  int next=0;
	  System.out.println("the fibo series : " + next);
	  for (int i = 2; i < num; i++) {
		  next=a1+a2;
		  System.out.println("the fibo series : " + next);
		  a1=a2;
		  a2=next;
		  
	}
	   
	   
  }
}
