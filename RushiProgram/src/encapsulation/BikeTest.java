package encapsulation;

public class BikeTest {

	public static void main(String[] args) {
		Bike b1=new Bike();
		
		b1.setId(101);
		b1.setPrice(120000);
		b1.setEngine(150);
		
		b1.setName("Pulsor");
		b1.setBrand("Bajaj");
		b1.setColour("Balck");
		
		System.out.println(b1.getId()+" "+b1.getPrice()+" "+b1.getEngine()+" "+b1.getName()+" "+b1.getBrand()+" "+b1.getColour());
       
		System.out.println();
	  b1.setInstallment(2);

	}

}
