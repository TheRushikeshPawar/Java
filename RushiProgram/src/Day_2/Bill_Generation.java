package Day_2;

import java.util.Scanner;

public class Bill_Generation {

	public static void main(String[] args) {
	System.out.println("Bill Generation :");
	String item;
	int total;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The item :");
	item=sc.next();
	System.out.println("\n");
	System.out.println("Display item :"+item);
	int price,quantity;
	System.out.println("Enter The Price :");
	price=sc.nextInt();
	System.out.println("Enter The Quantity :");
quantity=sc.nextInt();
total=price*quantity;
System.out.println("Total Price is :"+total);
	}

}
