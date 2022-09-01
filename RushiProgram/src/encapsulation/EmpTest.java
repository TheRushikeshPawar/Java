package encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setSalary(25000);
		e1.setName("Ajay");
		
		System.out.println(e1.getId()+" "+e1.getSalary()+" "+e1.getName());

	}

}
