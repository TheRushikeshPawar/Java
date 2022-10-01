package abstractionClass;

public class Employee {
	
	private int id,salary;
	private String name; 
	
		
  public void setId (int id)
  {
	  this.id=id;
  }
  public  int getId()
  {
	  return id;
	  
	}
  
  public void setSalary(int salary)
  {
	  this.salary=salary;
  }
  public int getSalary()
  {
	  return salary;
  }
  
  
  public void setName(String name)
  {
	  this.name=name;
  }
  public String getName()
  {
	  return name;
  }

}

