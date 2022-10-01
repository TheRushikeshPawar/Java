package containment;

public class Idproof {
	
	private String name,id;
	
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
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
		return id+"\n"+name;
	}
}
