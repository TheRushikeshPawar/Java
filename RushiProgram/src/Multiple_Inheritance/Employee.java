package Multiple_Inheritance;

public class Employee extends Person {
	
	String company,dept;
	
	void setData(String company,String dept)
	{
		this.company=company;
		this.dept=dept;
	}
	
	void display()
	{
		super.display();
		System.out.println(company+" "+dept);
	}

}
