package wrapperClasses;

public class WrapingExample {

	public static void main(String[] args) {
		
		int a=20;
		Integer i=new Integer(a);  //boxing/wrapping
		
		Integer i1=a;       //autoBoxing
		
		Integer a1=new Integer(a);
		Integer a2=a;
		
		System.out.println(a1==a2);    //memory Location
		System.out.println(a1.equals(a2));
		
		Integer b1=new Integer(500);
		
		int b=b1.intValue();
		float f=b1.floatValue();
		double d=b1.doubleValue();
		long l=b1.longValue();
		byte bt=b1.byteValue();
		short s=b1.shortValue();
		
		System.out.println(b+"\n"+f+"\n"+d+"\n"+l+"\n"+bt+"\n"+s);
		/*
		 * System.out.println(f); System.out.println(d); System.out.println(l);
		 * System.out.println(bt); System.out.println(s);
		 */

	}

}
