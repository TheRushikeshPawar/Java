package inheritance_Aggregation;

public class Id_Proof {
	
	int validety;
	String name,number;
	
	Id_Proof(String name,String number,int validety)
	{
		this.name=name;
		this.number=number;
		this.validety=validety;
	}
	
	public String toString() 
	{
		return "Id Proof : "+name+" \n"+"Aadhar Number : "+number+"\n"+"Validety : "+validety;
	}
	

}
