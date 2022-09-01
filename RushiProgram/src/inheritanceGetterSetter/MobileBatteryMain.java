package inheritanceGetterSetter;

public class MobileBatteryMain {

	public static void main(String[] args) {
		
		Battery b=new Battery();
		b.setId(4564);
		b.setName("Samsung");
		b.setCapacity("4500 wh");
		
		
		Mobile m=new Mobile();
		m.setID(51);
		m.setName("Samsung");
		m.setPrice(22000);
		m.setBattery(b);
		
		System.out.println(m.getId()+" "+m.getName()+" "+m.getPrice()+" : "+m.b.getID()+" "+m.b.getName()+" "+m.b.getCapacity());

	}

}
