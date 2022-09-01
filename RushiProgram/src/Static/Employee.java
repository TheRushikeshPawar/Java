package Static;

public class Employee {
	
	int id,salary;
	String name;
	
	static String compName="Infosys";
	
	static                                // static block only use to change String name
	{
		compName="Infosys Pune";
		System.out.println("Static block 1");
	}
	
	
	/* static 
	 * { 
	 * compName="Cognizant";
	 *  System.out.println("Static Block 2"); 
	 }*/
	 
	
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	    static void companyInfo() 
	    {
	    	System.out.println("Good Company ....one of the top most company");
	    	System.out.println(compName);        //static
	    	
	    	Employee emp=new Employee(111,"Anjali",40000);
	    	System.out.println(emp.salary);        // Non Static hence we create object emp.
	    			
}


 /*  public String toString()
  {
	return id+" "+salary+" "+name;
   } */
	    
	    void display()             // non static
	    {
	    	System.out.println(id+" "+salary+" "+name+" "+compName);
	    //	show();
	    	companyInfo();
			
		}
	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "rahul", 25000);
		System.out.println(Employee.compName);
		
		Employee e2=new Employee(102," vijay",30000);
		Employee.companyInfo();
		
		
		
		
		System.out.println(e1.id+" "+e2.name+" "+e1.salary);
		
		System.out.println(e2.id+" "+e2.name+" "+e2.salary);

	}

}
