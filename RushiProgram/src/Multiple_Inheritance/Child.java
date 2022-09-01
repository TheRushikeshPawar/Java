package Multiple_Inheritance;

public class Child extends Father {
	
	String fn;
	
	void setChidData(String fn)
	{
		this.fn=fn;
	}
	
	void display()
	{
		super.display();
		System.out.println(fn+" "+super.fn+" "+super.ln);
	}

}
