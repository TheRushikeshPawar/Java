package inheritanceGetterSetter;

public class Student {
	int id,marks;
	String name;
	
	
	public void setId(int id) 
	{
		this.id=id;
	}
	public int getId() {
		return id;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}


