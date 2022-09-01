package Constructor;

import java.util.Scanner;

public class Copy {
	int id,salary;
	String name;
	
	Copy(int id,int salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	// copy the value one in to another
	Copy(Copy ref)
	{
		this.id=ref.id;
		this.salary=ref.salary;
		this.name=ref.name;
	}
	

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Id :");
		int id=sc.nextInt();
		System.out.println("Enter The Salary :");
		int salary=sc.nextInt();
		System.out.println("Enter The Name :");
		String name=sc.next();
		
		Copy c1=new Copy(id,salary,name);             //c1=first created object
		System.out.println();
		System.out.println("C1 Id is     :"+c1.id);
		System.out.println("C1 Salary is :"+c1.salary);
		System.out.println("C1 Name is   :"+c1.name);
		System.out.println();
		Copy c2=new Copy(c1);                         // c2=second created object
		System.out.println();
		System.out.println(c2.id+" "+c2.salary+" "+c2.name);
		

	}
}
