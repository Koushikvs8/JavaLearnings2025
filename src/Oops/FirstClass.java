package Oops;

public class FirstClass {
    static int Likecount;
    String profileName;
	
	
	public FirstClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void clickLike()
	{   int Count=0;
	    Count=Likecount;
		Likecount=Count+1;
		System.out.println("Liked the post "+ Likecount);
	
	}
	
	public void clickDislike()
	{
		System.out.println("disliked the post");
	}
	
	
	public static void main(String[] argsd)
	{
		FirstClass fc1=new FirstClass();
		System.out.println(fc1.profileName);
	    fc1.clickDislike();
	    clickLike();
	    FirstClass fc2=new FirstClass();
	    clickLike();
	} 

}
