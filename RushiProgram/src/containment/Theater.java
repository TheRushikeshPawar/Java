package containment;

import java.util.Arrays;

public class Theater { 
	
	private int id;
    private String name;
    private Movies m[];
    
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
    
    public void setM(Movies[] m) 
    {
		this.m = m;
	}
	public Movies[] getM() 
	{
		return m;
	}
	
	public String toString() 
	{
	return id+"\n"+name+"\n"+Arrays.toString(m);
	}
	
}
