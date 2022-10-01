package exceptionHandaling;

import java.util.Scanner;

public class RollarCosaterRideMain {
	
	static void ridecheck(int age) throws AgeException
	{
		if(age>50)
			throw new AgeException("Age is More Hence Not Allowd.. ");
		
		else if(age<16)
			throw new AgeException("Age is Less Sorry it's Not Allowd..");
		else
			System.out.println("Enjoy Your Ride....");
	}

	public static void main(String[] args) {
		
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Age : ");
		age=sc.nextInt();
		
		try {
			
		ridecheck(age);
		}
		catch (AgeException e)
		{
			e.printStackTrace();
		}

	}

}
