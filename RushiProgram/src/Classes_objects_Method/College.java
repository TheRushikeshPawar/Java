package Classes_objects_Method;

public class College {
	
	
	void displayname()
	{
		System.out.println("Name is : ABC College");
		
	}
	void departments()
	{
		System.out.println("There are total 4 Departments ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College c1=new College();
		c1.displayname();
		c1.departments();
	}

}
