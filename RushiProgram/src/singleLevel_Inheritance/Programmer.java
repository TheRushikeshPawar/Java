package singleLevel_Inheritance;

public class Programmer extends Employee{
	
	public int bonas;
	String dept;
	
	public void setProgrammerData(int bonas,String dept)
	{
		this.bonas=bonas;
		this.dept=dept;
	}

	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+bonas);
	}
}
