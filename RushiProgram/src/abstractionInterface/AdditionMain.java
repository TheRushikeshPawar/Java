package abstractionInterface;

public class AdditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition add=(a,b)-> System.out.println("Addition of two Numbers :"+(a+b));
		int a=100, b=250;
		add.add(a, b);                
		
		
		// ()->   Implementation
		//Functional Interface 
		// it has only one method
	}

}
