package containment;

public class Person {

	private int id,age;
	private String name,contact;
	private Address a;
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setContact(String contact) 
	{
		this.contact = contact;
	}
	public String getContact() 
	{
		return contact;
	}
	
	public void setA(Address a)
	{
		this.a = a;
	}
	public Address getA() 
	{
		return a;
	}
	
	
}

