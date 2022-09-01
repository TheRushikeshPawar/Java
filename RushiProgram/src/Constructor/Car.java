package Constructor;

import java.util.Scanner;

public class Car {
	
	int id,price,launchyear;
	String name,brand;
	
	Car()                          // default Constructor
	{
		id=00;
		name="name";
		brand="brand";
		launchyear=0000;
		price=00;
	}
	
	Car(int i,String n,String b,int y,int p)
	{
		id=i;
		name=n;
		brand=b;
		launchyear=y;
		price=p;
	}
	
	public String toString()        // override toSrting method of object class 
	{
	return id+" "+name+" "+brand+" "+launchyear+" "+price;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+brand+" "+launchyear+" "+price);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Car Id :");
		int id=sc.nextInt();
		System.out.println("Enter Car Name :");
		String name=sc.next();
		System.out.println("Enter The Car Brand :");
		String brand=sc.next();
		System.out.println("Enter The Car Lunch Year :");
		int launchyear=sc.nextInt();
		System.out.println("Enter Car Price :");
		int price=sc.nextInt();
	    
		Car c1=new Car();
		c1.display();
		Car c2=new Car(id,name,brand,launchyear,price);
	    c2.display();
		
		
	}

}
