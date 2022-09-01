package harachical_Inheritance;

public class FatherMain {

	public static void main(String[] args) {
		
		/*Son s=new Son();
		s.vehical();
		s.house();*/
		
		Father f=new Father();
		f.vehical();
		
		System.out.println("\n Son Object");
		
		f=new Son();
		f.vehical();
		f.house();
		
		System.out.println("\n Dougghter Object");
		
		f=new Doughter();
		f.vehical();
		f.house();

	}

}
