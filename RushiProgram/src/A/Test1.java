package A;

public class Test1 {
	
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	
	  public void display() 
	    {
		  System.out.println("All the Variables"); 
		 }
	 

	protected static void main(String[] args) 
	
	{
		
		Test1 t1=new Test1();
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);	

	}

}
