package inheritance_Aggregation;

public class CarDriverMain {

	public static void main(String[] args) {

		Driver d1=new Driver(1,"Ajay","9764557834");
		Driver d2=new Driver(2,"Vijay","9845678998");
		Driver d3=new Driver(3,"Ramesh","9124565785");
		
		
		
		  Car c1=new Car(101,"Bolero","67589",d1);
		  Car c2=new Car(102,"Nexon","584939",d2); 
		  Car c3=new Car(103,"Swift","675678",d3);
		 
		
		
		  System.out.println(c1); 
		  System.out.println();
		  System.out.println(c2);
		  System.out.println();
		  System.out.println(c3);
		 
		
	}

}
