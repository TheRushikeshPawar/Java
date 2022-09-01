package inheritance_Aggregation;

public class Person1 {
	
	int id;
	String name,contact,address;
	Id_Proof i;
	
	Person1(int id,String name,String contact,String address,Id_Proof i)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.address=address;
		this.i=i;
	}
	
	public String toString()
	{
	
		return "id : "+id+" "+name+" "+contact+" "+address+" : "+i;
	}

}
