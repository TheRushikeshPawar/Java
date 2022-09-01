package Multiple_Inheritance;

public class ManagerGS extends EmployeeGS {
	
	private int salary;
	private String designation;
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getDesignation()
	{
		return designation;
	}

}
