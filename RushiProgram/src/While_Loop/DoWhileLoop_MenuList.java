package While_Loop;

import java.util.Scanner;

public class DoWhileLoop_MenuList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			int p,q,total;
			char ch1;
			do
			{
			//p=price,=quantity
			System.out.println("Menu List :");
			System.out.println("1.Maharashtrian Thali :"+150);
			System.out.println("2.Gujrathi Thalia     :"+220);
			System.out.println("3.Rajasthani Thali    :"+300);
			System.out.println("4.Hydrabadi Thali     :"+500);
			System.out.println("5.Punjabi Thali       :"+350);
			System.out.println("Choose Your order ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Maharashtian Thali ");
				p=150;System.out.println("How Many Quantity You Want :");
				q=sc.nextInt();
				System.out.println("Total Bill is :"+p*q);
			break;
			case 2:
				System.out.println("Gujrathi Thali ");
				p=220;System.out.println("How Many Quantity You Want :");
				q=sc.nextInt();
				System.out.println("Total Bill is :"+p*q);
				break;
			case 3:
				System.out.println("Rajsthani Thali ");
				p=300;System.out.println("How Many Quantity You Want :");
				q=sc.nextInt();
				System.out.println("Total Bill is :"+p*q);
				break;
			case 4:
				System.out.println("Hydrabadi Thali ");
				p=500;System.out.println("How Many Quantity You Want :");
				q=sc.nextInt();
				System.out.println("Total Bill is :"+p*q);
				break;
			case 5:
				System.out.println("Punjabi Thali ");
				p=350;System.out.println("How Many Quantity You Want :");
				q=sc.nextInt();
				System.out.println("Total Bill is :"+p*q);
				break;
				default:
					System.out.println("Please Choose from list ");
			}
			System.out.println("Do You Want To Continue ?? (y/n)");
			ch1=sc.next().charAt(0);
			
			}while(ch1=='y' || ch1=='Y');
		}

}
