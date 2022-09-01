package arrayOfObject;

public class Employee {
	
	int id,salary;
	String name,dept;
	
	Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String toString()
	{
		return "id : "+id+"\n"+"Name : " +name+"\n"+"Department : "+dept+"\n"+"Salary : "+salary;
	}

}
