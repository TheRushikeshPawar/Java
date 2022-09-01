package If_else_Statement;

import java.util.Scanner;

public class quality_product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any item :");
		String item=sc.next();
	 System.out.println("Enter item price :");
	 
int price=sc.nextInt();
int totalprice=0;
if(price>50000)
{
	System.out.println("Exelant Quality");
	System.out.println("How many quantity you want :");
	int quantity=sc.nextInt();
	totalprice=quantity*price;
	System.out.println("Total price is :"+totalprice);
	
}
else if(price>25000)
{
	System.out.println("Good Quality");
	System.out.println("How many quantity you want :");
	int quantity=sc.nextInt();
	totalprice=quantity*price;
	System.out.println("Total price is :"+totalprice);	
	}
else 
	System.out.println("Poor Quality");
}
}
