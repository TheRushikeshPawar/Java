package encapsulation;

public class Bike {
	
	private int id,price,engine,installment;
	private String name,brand,colour;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setEngine(int engine)
	{
		this.engine=engine;
	}
	public int getId()
	{
		return id;
	}
	public int getPrice()
	{
		return price;
	}
	public int getEngine()
	{
		return engine;
	}
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBrand(String brand) 
	{
	this.brand=brand;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	
	public String getName() {
		return name;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getColour()
	{
		return colour;
	}
		public void setInstallment(int installment)
		{
			int  discount;
			if(installment==1)
			{
				discount=price*20/100;
				price=price-discount;
				
				System.out.println("Discount Price on First Installment :"+discount);
				System.out.println("Total Price after Discount :"+price);
			}
			else if(installment==2)
			{
				discount=price*10/100;
				price=price-discount;
				
				System.out.println("Discount Price on Second Installment :"+discount);
				System.out.println("Total Price after Discount :"+price);
			}
			else if(installment==3)
			{
				discount=price*5/100;
				price=price-discount;
				
				System.out.println("Discount Price on Third Installment :"+discount);
				System.out.println("Total Price after Discount :"+price);
             	}
			}
		
			public int getInstallment() 
			{
				return installment;
			}

}
