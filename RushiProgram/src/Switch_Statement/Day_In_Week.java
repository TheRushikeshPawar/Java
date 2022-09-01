package Switch_Statement;

import java.util.Scanner;

public class Day_In_Week {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose Your Day : ");
	System.out.println("1.Monday");
	System.out.println("2:Tuesday");
	System.out.println("3:Wednesday");
	System.out.println("4:Thursday");
	System.out.println("5:Friday");
	System.out.println("6:Saturday");
	System.out.println("7:Sunday");
	
	System.out.println("Enter The Day Number :");
	int num=sc.nextInt();	

	switch(num) {
	case 1:
	
	System.out.println("Day is Monday");
	break;
	
	case 2:
		System.out.println("Day is Tuesday");
	break;
	
	case 3:System.out.println("Day is Wednesday");
	break;
	
	case 4:System.out.println("Day is Thursday");
	break;
	
	case 5:System.out.println("Day is Friday");
	break;
	
	case 6:System.out.println("Day is Saturday");
	break;
	
	case 7:System.out.println("Day is Sunday");
	
	break;
	default:
	 System.out.println("Error : Day Dose Not Exis !");
	
	}

}
}
