package Classes_objects_Method;

import java.util.Scanner;

public class NationalGames {
	
	
	void game(String countryname)
	{	
		switch(countryname)
		{
		case "India":System.out.println("National Game is Hockey");
		break;
		
		case "Bangladesh":System.out.println("Kabaddi");
		break;
		
		case "Italy":System.out.println("FootBall");
		break;
		
		case "China":System.out.println("Table Tennis");
		break;
		
		case "United States":System.out.println("Base Ball");
		break;
		default:System.out.println("Invalid Country ....!!! ");
	}
}
	

	public static void main(String[] args) {
		
		NationalGames n1=new NationalGames();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("India");
		 System.out.println("Bangladesh");
		 System.out.println("Italy");
		 System.out.println("China");
		 System.out.println("United States ");
		 
		System.out.println();
		System.out.println("Enter a Country Name :");
		String countryname=sc.next();
		n1.game(countryname);
		
		
		
		}

	}

