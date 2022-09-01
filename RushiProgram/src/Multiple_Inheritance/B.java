package Multiple_Inheritance;

public class B extends A {
	
	
	  B() 
	  { 
		  System.out.println("Inside Class B Constructor"); 
	  }
	 
	
	B(int a)
	{
		super();           //super class in java
		System.out.println("Inside Class B Parameterized Constructor: "+a);
	}
	
	public A display()
	{
		System.out.println("Display in B Class");  
		return new A();      // covariant return type method
		                     //return this;     this --> new A();
	}                        //this keyword refers current object

}
