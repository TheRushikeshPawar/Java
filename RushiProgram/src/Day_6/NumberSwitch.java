package Day_6;

import java.util.Scanner;

public class NumberSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month number :");
		int ch=sc.nextInt();
		System.out.println("Enter The Year :");
	int yr=sc.nextInt();    
	
		switch(ch)
		{
		case 1 :System.out.println("31 Days");
		break;
		case 2 :
		if(yr % 4==0) {
			System.out.println("29 days");
		}
		else 
			System.out.println("28");
	
		break;
		case 3:System.out.println("31 Days");
		break;
		case 4:System.out.println("30 Days");
		break;
		case 5:System.out.println("31 Days");
		break;
		case 6:System.out.println("30 Days");
		break;
		case 7:System.out.println("31 Days");
		break;
		case 8:System.out.println("31 Days");
		break;
		case 9:System.out.println("30 Days");
		break;
		case 10:System.out.println("31 Days");
		break;
		case 11:System.out.println("30 Days");
		break;
		case 12:System.out.println("31 Days");
		break;

		default:System.out.println("Invalid Month");
	}
	
	}
}
