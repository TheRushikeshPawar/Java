package inheritance_Aggregation;

public class Department {
	int id , NoStudent;
	String name ,hod;
	Student s;
	
	Department(int id,int NoStudent,String name,String hod,Student s)
	{
		this.id=id;
		this.NoStudent=NoStudent;
		this.name=name;
		this.hod=hod;
		this.s=s;
		
	}
	
	public String toString()
	{
		return id+" "+NoStudent+" "+name+" "+hod+" : "+s;
	}
}
