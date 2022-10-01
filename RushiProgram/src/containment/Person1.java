package containment;

import java.util.Arrays;

public class Person1 {
	
	private int id;
	private String name,contact;
	private Idproof idp[];
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
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
	
	public void setContact(String contact)
	{
		this.contact=contact;
	}

	public String getContact()
	{
		return contact;
	}
	
	public void setIdp(Idproof[] idp) 
	{
		this.idp = idp;
	}
	public Idproof[] getIdp() 
	{
		return idp;
	}
	
	public String toString()
	{
		return id+"\n"+name+"\n"+contact+"\n"+Arrays.toString(idp);
	}
	
}
