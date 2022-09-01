package Multiple_Inheritance;

public class Manager extends Employee {
	
	int salary;
	String designation;
	
	void setData(int salary,String designation)
	{
		this.salary=salary;
		this.designation=designation;
	}
	
	void display()
	{
		super.display();
		System.out.println(salary+" "+designation);
	}

}
