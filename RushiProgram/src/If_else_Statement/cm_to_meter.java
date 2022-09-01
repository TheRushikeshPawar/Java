package If_else_Statement;
import java.util.Scanner;
public class cm_to_meter {

	public static void main(String[] args) {
	double cm,meter,km;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Length in Centimeter :");
	cm=sc.nextDouble();
	
	meter=cm/100;
	km=cm/100000;
	System.out.println("cm into meter : "+meter);
	System.out.println("cm into km : "+km);
	
	}

}
