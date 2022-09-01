package Classes_objects_Method;

import java.util.Scanner;

public class EmployeSalary {
	
	int id,salary,salarybonas,bonas;
	String name,department;
	char rating;
	
	void dataset(int i,int s,char r,String n,String d)
	{
		id=i;
		salary=s;
		name=n;
		department=d;
		rating=r;
		
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
		System.out.println("Employe ID            :"+id);
		System.out.println("Employe NAME          :"+name);
		System.out.println("Employe Salary        :"+salary);
		System.out.println("Employe Department    :"+department);
		System.out.println("Employe Bonas         :"+bonas+"%");
		System.out.println("Employe Salary Bonas  :"+salarybonas);
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
	       
	       System.out.println("--------------------------------");
	       
	       EmployeSalary e2=new EmployeSalary();
	       System.out.println("Enter The Details :");
		    
		    System.out.println("Enter Employe Id :");
		   id=sc.nextInt();
		    System.out.println("Enter Employe Name :");
		   name=sc.next();
		   System.out.println("Enter Employe Department :");
		   department=sc.next();
		   System.out.println("Enter The Bonas Rating :");
		   rating=sc.next().charAt(0);
		   System.out.println("Enter Employe Salary :");
		   salary=sc.nextInt();
		   
		   
	         e2.dataset(id, salary, rating, name, department);	
	         e2.bonas();
		   
		     System.out.println();
		       e2.displayemploye();
		       System.out.println("--------------------------------");
		       
		       EmployeSalary e3=new EmployeSalary();
		       System.out.println("Enter The Details :");
			    
			    System.out.println("Enter Employe Id :");
			   id=sc.nextInt();
			    System.out.println("Enter Employe Name :");
			   name=sc.next();
			   System.out.println("Enter Employe Department :");
			   department=sc.next();
			   System.out.println("Enter The Bonas Rating :");
			   rating=sc.next().charAt(0);
			   System.out.println("Enter Employe Salary :");
			   salary=sc.nextInt();
			   
			   
		         e3.dataset(id, salary, rating, name, department);	
		         e3.bonas();
			   
			     System.out.println();
			       e3.displayemploye();

	}

}
