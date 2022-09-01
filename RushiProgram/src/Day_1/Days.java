package Day_1;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Days :");
int day=sc.nextInt();
int yrs=day/365;
int mon=day/12;
int week=day/7;
System.out.println("Days :"+day);
System.out.println("Year :"+yrs);
System.out.println("Month :"+mon);
System.out.println("week :"+week);
	}

}
