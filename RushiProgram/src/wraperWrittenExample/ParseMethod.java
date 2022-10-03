package wraperWrittenExample;

import java.util.Scanner;

public class ParseMethod {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Numeric Value ");
		String s1=sc.next();
		
		byte b=Byte.parseByte(s1);
		int i=Integer.parseInt(s1);
		short s=Short.parseShort(s1);
		float f=Float.parseFloat(s1);
		double d=Double.parseDouble(s1);
		
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
	}

}
