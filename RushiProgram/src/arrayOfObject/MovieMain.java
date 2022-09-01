package arrayOfObject;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size :");
		int size=sc.nextInt();
		
		Movie mov[]=new Movie[size];
		
		for(int i=0;i<size;i++)
	      {
	    	  System.out.println("Enter Movie Details :");
	    	  int movieId=sc.nextInt();
	    	  String name=sc.next();
	    	  int year=sc.nextInt();
	    	  int boxOfficeColl=sc.nextInt();
	    	  String producer=sc.next();
	    	  
	    	  mov[i]=new Movie(movieId,name,year,boxOfficeColl,producer);

	}
		for(Movie m:mov)
		{
			if(m.boxOfficeColl>15000000 && m.producer.equals("KevinFeige"))
			System.out.println(m);
			
		}
	}
}
