package collectionAssignment1;

public class Employee {
	
	private int id,salary;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() 
	{
		return name;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	
	
	@Override
	public String toString() {
		return "ID : "+id+"\n"+"Salary : "+ salary+"\n"+"Name : "+name+"\n";
	}

}
