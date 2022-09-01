package inheritanceGetterSetter;

public class Mobile {
	private int id,price;
	private String name;
	Battery b;
	
	//Setter 
	public void setID(int id)
	{
		this.id=id;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setBattery(Battery b)
	{
		this.b=b;
	}
	
	//getter
	public int getId()
	{
		return id;
	}
	public int getPrice()
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public Battery getBattery()
	{
		return b;
	}

}
