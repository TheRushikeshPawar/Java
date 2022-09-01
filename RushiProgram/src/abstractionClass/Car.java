package abstractionClass;

public abstract class Car {
	
	String colour;
	int price;
	
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public String getColour()
	{
		return colour;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	
	void wheelNo()
	{
		System.out.println("4 wheels");
	}

	void headLight()        //concreat method
	{
		System.out.println("2 Head Lights");
	}
	
	abstract void engine();
	abstract void features();
	abstract void dashBoard();
	abstract void weelType();
}
