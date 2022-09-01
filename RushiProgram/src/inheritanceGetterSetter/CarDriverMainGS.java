package inheritanceGetterSetter;

public class CarDriverMainGS {

	public static void main(String[] args) {
	
		DriverGS d=new DriverGS();
		
		d.setID(104);
		d.setName("Vikram");
		d.setContact("9786546789");
		
		
		CarGS c4=new CarGS();
		
		c4.setId(1);
		c4.setName("Nexon");
		c4.setCnumber("789654");
		c4.setD(d);
		
		
		System.out.println(d.getId()+" "+d.getName()+" "+d.getContact());
		System.out.println(c4.getId()+" "+c4.getName()+" "+c4.getCnumber()+":"+c4.d.getId()+" "+c4.d.getName()+" "+c4.d.getContact());
		
		

	}

}
