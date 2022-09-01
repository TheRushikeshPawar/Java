package Multiple_Inheritance;

public class PersonMain {

	public static void main(String[] args) {
		
		Manager m=new Manager();
		m.setData("Ajay", "9786564567", "Jalgaon");
		m.setData("Infosys", "IT");
		m.setData(600000, "Software Enggineer");
        m.display();
	}

}
