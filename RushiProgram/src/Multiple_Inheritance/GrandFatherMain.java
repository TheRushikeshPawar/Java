package Multiple_Inheritance;

public class GrandFatherMain {

	public static void main(String[] args) {
	
		Child c=new Child();
		c.setData("Dhondiram", "Tukaram", "Pawar");
		c.setFatherData("Bhausaheb");
		c.setChidData("Rushikesh");
		
		c.display();
      
	}

}
