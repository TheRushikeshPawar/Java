package Multiple_Inheritance;

public class PersonMainGS {

	public static void main(String[] args) {
	
		ManagerGS m=new ManagerGS();
		
		m.setName("Ajay");
		m.setContact("9764245590");
		m.setAddress("Jalgaon");
		
	    m.setId(101);
	    m.setCompany("Infosys");
	    m.setDepartment("IT");
	    
	    m.setSalary(45000);
	    m.setDesignation("Software Enggineer");
	    
	    System.out.println(m.getName()+" "+m.getContact()+" "+m.getAddress());
	    System.out.println(m.getID()+" "+m.getCompany()+" "+m.getDepartment());
	    System.out.println(m.getSalary()+" "+m.getDesignation());
		
		
		

	}

}