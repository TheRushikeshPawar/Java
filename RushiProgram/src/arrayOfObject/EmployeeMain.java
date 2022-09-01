package arrayOfObject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
      int size=sc.nextInt();
      
      Employee emp[]=new Employee[size];
      
      emp[0]=new Employee(101,"Rahul","HR",70000);
      emp[1]=new Employee(102,"Vijay","Marketing",75000);
      emp[2]=new Employee(103,"Riya","Sales",40000);
      emp[3]=new Employee(104,"Ajay","HR",60000);
      emp[4]=new Employee(105,"Akash","HR",650000);
      
      
      
      
   /*   for(int i=0;i<size;i++)
      {
    	  System.out.println("Enter Employee Details :");
    	  int id=sc.nextInt();
    	  String name=sc.next();
    	  String dept=sc.next();
    	  int salary=sc.nextInt();
    	  
    	  
    	  emp[i]=new Employee(id,name,dept,salary);     
      }                                                 */
	
	
      for(Employee e:emp)
      {
    	  //if(e.dept.equalsIgnoreCase("hr"))        //hr
    	//  System.out.println(e);
    	  
    	  if(e.salary>60000)
    	  {
    		  System.out.println(e.name+" "+e.salary);
    	  }
      }
      
	}

}
