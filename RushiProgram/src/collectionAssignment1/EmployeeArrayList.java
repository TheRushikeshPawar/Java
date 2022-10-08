package collectionAssignment1;

import java.util.ArrayList;

public class EmployeeArrayList {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Rushikesh Pawar ");
		e1.setSalary(25000);
		
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("Vijay Salunkhe");
		e2.setSalary(20000);
		
		Employee e3=new Employee();
		e3.setId(103);
		e3.setName("Ajay Patil");
		e3.setSalary(30000);
		
		Employee e4=new Employee();
		e4.setId(104);
		e4.setName("Samir Thakare");
		e4.setSalary(20000);
		
		Employee e5=new Employee();
		e5.setId(105);
		e5.setName("Akash Chaudhari ");
		e5.setSalary(15000);
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		a1.add(e5);
		
		for(Employee a:a1)
		{
			System.out.println(a);
		}
		

	}

}
