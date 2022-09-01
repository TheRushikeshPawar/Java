package If_else_Statement;

import java.util.Scanner;

public class Equlateral_trg {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sides of Trangle :");
	double a=sc.nextDouble();
	double area=(Math.sqrt(3)/4)*(a*a);
	System.out.println("Area of Trangle is : "+area);

	}

}
