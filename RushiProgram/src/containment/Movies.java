package containment;

public class Movies {
	
	private int id,boxOfficeColl,year;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setBoxOfficeColl(int boxOfficeColl)
	{
		this.boxOfficeColl=boxOfficeColl;
	}
	public int getBoxOfficeColl()
	{
		return boxOfficeColl;
	}
	
	public void setYear(int year)
	{
		this.year=year;
		
	}
	public int getYear()
	{
		return year;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return id+"\n"+name+"\n"+boxOfficeColl+"\n"+year;
	}
}
