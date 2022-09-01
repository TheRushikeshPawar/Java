package inheritance_Aggregation;

public class PersonAddressMain {

	public static void main(String[] args) {

		Address a1=new Address("Jalgaon","Maharashtra","India");
		Address a2=new Address("Goliyr","MadhyaPradesh","India");
		Address a3=new Address("Jaypur","Rajasthan","India");
		
		Person p1=new Person("Ajay",23,"Male",a1);
		Person p2=new Person("Vaishnavi",22,"Female",a2);
		Person p3=new Person("Rohit",24,"Male",a3);
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
		System.out.println(p3);
		
		
	

	}

}
