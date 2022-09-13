package arrayOfObject;

import java.util.Scanner;

public class EmployeeGSMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size");
		
		int size=sc.nextInt();
		
		EmployeeGS emp[]=new EmployeeGS[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Employee Details :");
			System.out.println("Enter Employee Id :");
			int id=sc.nextInt();
			System.out.println("Enter the Employee Name :");
			String name=sc.next();
			System.out.println("Enter The Employee Department :");
			String dept=sc.next();
			System.out.println("Enter The Employee Salary :");
			int salary=sc.nextInt();
			
			EmployeeGS e=new EmployeeGS();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			
			emp[i]=e;
			
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+ " "+e.getSalary());
			
		}

	}

}
