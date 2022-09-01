package harachical_Inheritance;

public class Maruti {
	
	private int price;
	private String name,colour;
	
	public void setPrice(int price)        //setter
	{
		this.price=price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	
	
	public int getPrice()        //getter
	{
		return price;
	}
	public String getName()
	{
		return name;
	}
	public String getColour()
	{
		return colour;
	}

}
