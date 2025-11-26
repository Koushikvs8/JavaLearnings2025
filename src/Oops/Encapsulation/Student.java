package Oops.Encapsulation;

public class Student {
      private String name;
      
      
      public String getName()
      {
    	  return this.name;
      }
	
      public void setName(String name)
      {
    	  this.name=name;
      }
	
	public static void main(String[] args)
	{
		Student st =new Student();
		st.setName("koushik");
		System.out.print(st.getName());
	}

}
