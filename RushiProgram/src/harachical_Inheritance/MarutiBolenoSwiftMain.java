package harachical_Inheritance;

public class MarutiBolenoSwiftMain {

	public static void main(String[] args) {
		
		Boleno b=new Boleno();
	   
		b.setEngine(1197 );
	    b.setModel("Sigma");
		
		b.setName("Boleno");
		b.setPrice(130000);
		b.setColour("Red");
	    
		Swift s=new Swift();
		s.setEngine(1195);
        s.setModel("Dizir");
        
        s.setName("Swift");
		s.setPrice(150000);
		s.setColour("White");
        
        
        System.out.println(b.getName()+" "+b.getPrice()+" "+b.getColour()+" "+b.getEngine()+" "+b.getModel());
        System.out.println();
        System.out.println(s.getName()+" "+s.getPrice()+" "+s.getColour()+" "+s.getEngine()+" "+s.getModel());
        
	}

}
