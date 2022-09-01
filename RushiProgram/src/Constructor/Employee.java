package Constructor;

import java.util.Scanner;

public class Employee {
	
	int emp_id,salary;
	String name;
	
	Employee()
	{
		emp_id=101;
		salary=25000;
		name="Ajay";
		
	}
	Employee(int emp_id,int salary,String name)
	{
		
		this.emp_id=emp_id;
		this.salary=salary;
		this.name=name;
	}
	
	public String toString()
	{
		return emp_id+" "+salary+" "+name;
	}
	void display()
	{
		System.out.println(emp_id+" "+salary+" "+name);
	}

	public static void main(String[] args) {
		System.out.println("Default Constructor :");
		Employee e1 = new Employee();
		e1.display();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("Parameterised Constructor :");
		System.out.println("Enter The Employee Id :");
		int emp_id=sc.nextInt();
		System.out.println("Enter The Employe Salary :");
		int salary=sc.nextInt();
		System.out.println("Enter Emplyee Name :");
		String name=sc.next();
		
		Employee e2=new Employee(emp_id,salary,name);
		e2.display();
		
		//System.out.println(e2);
		
		
	}

}
