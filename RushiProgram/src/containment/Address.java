package containment;

public class Address {
	
	private int pinCode;
	private String street,city,state,country;
	
	public void setPinCode(int pinCode)
	{
		this.pinCode=pinCode;
	}
	public int getPinCode()
	{
		return pinCode;
	}
	
	public void setStreet(String street)
	{
		this.street=street;
	}
	public String getStreet()
	{
		return street;
	}
	
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	
      public void setState(String state)
  {
	this.state=state;
  }
      public String getState()
      {
    	  return state;
      }
      
      public void setCountry(String country)
      {
    	  this.country=country;
      }
      public String getCountry()
      {
    	  return country;
      }
	
	

}
