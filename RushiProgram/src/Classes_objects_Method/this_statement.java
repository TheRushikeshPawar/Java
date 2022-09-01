package Classes_objects_Method;

import java.util.Scanner;

public class this_statement {

	int id,salary,salarybonas,bonas;
	String name,department;
	char rating;
	
	void dataset(int id,int salary,char rating,String name,String department)
	{
		this.id=id;            // this.id=id   this=s1   s1.id=id   
		this.salary=salary;         // this statement shows new object in method if globel variable and local variables are same
		this.name=name;
		this.department=department;
		this.rating=rating;
		
	}
     void bonas()
	{
			if(rating=='A')
			  {
				bonas=20 ;
				salarybonas=salary+(salary*20/100);
				System.out.println("20 % Bonas for Rating 'A' :"+salarybonas);
			  }
			else if(rating=='B')
			{
				bonas=15;
			salarybonas=salary+(salary*15/100);
			System.out.println("15 % Bonas for Rating 'B' :"+salarybonas);
			}
			
			else if(rating=='C')
			{
				bonas=10;
			salarybonas=salary+(salary*10/100);
			System.out.println("10 % Bonas for Rating 'c' :"+salarybonas);
			 }
			else if(rating=='C')
			{
				bonas=0;
				salarybonas=salary+(salary*0/100);
				System.out.println("No Bonas For Rating 'D' :"+salarybonas);
			}
			else
				System.out.println("Invalid Rating ....!!!");
	}
	
	void displayemploye()
	{
		System.out.println("Employe ID         :"+id);
		System.out.println("Employe NAME       :"+name);
		System.out.println("Employe Salary     :"+salary);
		System.out.println("Employe Department :"+department);
		System.out.println("Employe Bonas      :"+bonas+"%");
		System.out.println("Employe Salary Bonas      :"+salarybonas);
	System.out.println();
	
	}

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    
	    EmployeSalary e1=new EmployeSalary();
	    
	    System.out.println("Enter The Details :");
	    
	    System.out.println("Enter Employe Id :");
	   int id=sc.nextInt();
	    System.out.println("Enter Employe Name :");
	   String name=sc.next();
	   System.out.println("Enter Employe Department :");
	   String department=sc.next();
	   System.out.println("Enter The Bonas Rating :");
	   char rating=sc.next().charAt(0);
	   System.out.println("Enter Employe Salary :");
	   int salary=sc.nextInt();
	   
	   
         e1.dataset(id, salary, rating, name, department);	
         e1.bonas();
	   
	     System.out.println();
	       e1.displayemploye();

	}

}