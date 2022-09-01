package Constructor;

import java.util.Scanner;

public class Bike {
	
	int id,price,payment;
	String bikename,brand,colour,paymentMode,engine;
	
	Bike(int i,String n,int p,String b,String c,String e,String m)
	{
		id=i;
		bikename=n;
		engine=e;
		price=p;
		brand=b;
		colour=c;
		paymentMode=m;
		
	}
	

	void payment()
	{
		int  discount;
		if(paymentMode.equals("cash"))
		{
			discount=price*20/100;
			price=price-discount;
			
			System.out.println("Cash Mode Discount Price :"+price);
		}
		else if(paymentMode.equals("online"))
		{
			discount=price*10/100;
			price=price-discount;
			System.out.println("Online Mode Discount Price :"+price);
		}
	}
	public String toString()    
	{
	return id+" "+bikename+" "+engine+" "+price+" "+brand+" "+colour+" "+paymentMode;
	}
	
	void display()
	{
		System.out.println(id+" "+bikename+" "+engine+" "+price+" "+brand+" "+colour+" "+payment);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bike Details :");
		System.out.println("Bike Id :");
		int id=sc.nextInt();
		System.out.println("Enter Bike Name :");
		String bikename=sc.next();
		System.out.println("Enter Bike Brand :");
		String brand=sc.next();
		System.out.println("Enter Bike Engine :");
		String engine=sc.next();
		System.out.println("Enter Bike Price :");
		int price=sc.nextInt();
		System.out.println("Enter Bike Colour :");
		String colour=sc.next();
		System.out.println("Enter Bike Payment Mode : cash or online");
		String paymentMode=sc.next();
		
		Bike b1=new Bike(id,bikename,price,brand,colour,engine,paymentMode);
		System.out.println(b1);
		b1.payment();
		
	}

}
