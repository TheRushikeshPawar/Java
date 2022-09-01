package inheritanceGetterSetter;

public class Battery {
	
	private int id;
	private String name,capacity;
	
	//setter 
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setCapacity(String capacity)
	{
		this.capacity=capacity;
	}

	//getter
	
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCapacity()
	{
		return capacity;
	}
}
