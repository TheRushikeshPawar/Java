package inheritanceGetterSetter;

public class DriverGS {
	
	private int id;
	private String name,contact;
	
// setter
	public void setID(int id) 
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	
// getter
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getContact()
	{
		return contact;
	}

}
