package singleLevel_Inheritance;

public class EmployeeProgrammerMain {

	public static void main(String[] args) {
		
		Programmer p=new Programmer();
		p.setEmployeeData(101, "Rushikesh", 25000);
		p.setProgrammerData(5000, "IT");
		
		p.display();

	}

}
