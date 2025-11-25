package Oops;

public class ClassWorkaround {
    int x;
    int y;
	public ClassWorkaround(int x ,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x +""+ y);
	}
	
	public static void main(String[] args)
	{
		ClassWorkaround cw=new ClassWorkaround(12, 23);
	    cw.display();
	}

}
