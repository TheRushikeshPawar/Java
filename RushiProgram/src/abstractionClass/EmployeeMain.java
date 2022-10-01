package abstractionClass;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter id ");
		int id=sc.nextInt();
		e.setId(id);
		System.out.println("Enter The Name");
		String name=sc.next();
		e.setName(name);
		System.out.println("Enter The Salary");
		int salary=sc.nextInt();
		e.setSalary(salary);
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());

	}

}
