package containment;

public class PersonAddressMain {

	public static void main(String[] args) {
		
		Address a1=new Address();
		a1.setPinCode(424101);
		a1.setStreet("Malegaon Road");
		a1.setCity("Chalisgaon");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		
		Person p1=new Person();
		p1.setId(101);
		p1.setName("Rushi");
		p1.setAge(23);
		p1.setContact("9764245590");
		p1.setA(a1);
		
		System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getAge()+" "+p1.getContact());
		System.out.println("\n");
	System.out.println(p1.getA().getPinCode()+" "+p1.getA().getState()+" "+p1.getA().getCity()+" "+p1.getA().getState()+" "+p1.getA().getCountry());

	}

}
