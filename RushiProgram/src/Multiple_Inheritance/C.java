package Multiple_Inheritance;

public class C extends B {
	
	
	  C() 
	  {
		  System.out.println("Inside Class C Default Constructor"); 
	  }
	 
	
	C(int a)
	{
		super(200);
		System.out.println("Inside Class C Parameterize Constructor : "+a);
	}
	
	public B display()
	{
		System.out.println("Display In C Class");
		return new B();
	}

}
