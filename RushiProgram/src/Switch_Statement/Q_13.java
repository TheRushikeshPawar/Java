package Switch_Statement;

import java.util.Scanner;

public class Q_13 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("1:Wish");
         System.out.println("2:You");
         System.out.println("3:A");
         System.out.println("4:Happy");
         System.out.println("5:New");
         System.out.println("6:Year");
         
        System.out.println("Enter the case number:");
        int code=sc.nextInt();
        
        switch(code)
        {
            case 1:
                System.out.println("Wish");
                break;
            case 2:
                System.out.println("You");
                break;
            case 3:
                System.out.println("A");
                break;
           
            case 4:
                System.out.println("Happy");
                break;
            case 5:
                System.out.println("New");
                break;
            case 6:
                System.out.println("Year");
                break;
            default:
                System.out.println("Invalid input");
                break;

	}
	}

}
