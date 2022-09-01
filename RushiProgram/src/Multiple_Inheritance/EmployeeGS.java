package Multiple_Inheritance;

public class EmployeeGS extends PersonGS {
	
	private int id;
	private String company,department;
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	
	public int getID()
	{
		return id;
	}
	public String getCompany()
	{
		return company;
	}
	public String getDepartment()
	{
		return department;
	}
	

}
