package inheritance_Aggregation;

public class MobilesBatteryMain {

	public static void main(String[] args) {
		
		Battery b1=new Battery(4456,"Samsung","4500wh");
		Battery b2=new Battery(4563,"Oopo","4000wh");
		Battery b3=new Battery(5634,"Vivo","4200wh");
		Battery b4=new Battery(7854,"Redmi","5200wh");
		Battery b5=new Battery(2378,"One Plus","5000wh");
		
		Mobiles m1=new Mobiles(1,22000,"Samsung",b1);
		Mobiles m2=new Mobiles(2,15000,"Oopo",b2);
		Mobiles m3=new Mobiles(3,13000,"Vivo",b3);
		Mobiles m4=new Mobiles(4,19000,"Redmi",b4);
		Mobiles m5=new Mobiles(5,30000,"One Puls",b5);
		
		
		System.out.println(m1);
		System.out.println();
		System.out.println(m2);
		System.out.println();
		System.out.println(m3);
		System.out.println();
		System.out.println(m4);
		System.out.println();
		System.out.println(m5);
		
		

	}

}
