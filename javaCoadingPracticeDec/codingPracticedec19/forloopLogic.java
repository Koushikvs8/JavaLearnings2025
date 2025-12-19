package codingPracticedec19;

public class forloopLogic {

	
	
	public static void main(String[] args) {
		int[] num= {1 ,2, 3,4,5,};
		
for (int i = 0; i < num.length; i++) {
	System.out.println("outside loop" +num[i] +"**************************");
	for (int j = 0; j < i; j++) {
		System.out.println("inside loop" +num[j]);
	}
	System.out.println("");
}
	}
}
