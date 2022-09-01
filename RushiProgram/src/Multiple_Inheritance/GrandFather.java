package Multiple_Inheritance;

public class GrandFather {
	
	String fn,mn;        //fn=first name, mn=midel name ,ln=last name
	static String ln;
	
	void setData(String fn,String mn,String ln)
	{
		this.fn=fn;
		this.mn=mn;
		this.ln=ln;
	}   
	
	void display()
	{
		System.out.println(fn+" "+mn+" "+ln);
	}
	

}
