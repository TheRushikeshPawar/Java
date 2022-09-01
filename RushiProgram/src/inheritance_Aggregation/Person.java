package inheritance_Aggregation;

public class Person {

	int age;
	String name,gender;
	Address a;
	
	Person(String name,int age,String gender,Address a)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.a=a;
		
	}
	public String toString()
	{
		return name+" "+age+" "+gender+" : "+a;
	}
}
