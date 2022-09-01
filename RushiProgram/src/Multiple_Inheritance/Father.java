package Multiple_Inheritance;

public class Father extends GrandFather {
	
	String fn;
	
	void setFatherData(String fn) 
	{
	  this.fn=fn;
		
	}
	
	void display()
	{
		super.display();
		System.out.println(fn+" "+super.fn+" "+super.ln);
	}

}
