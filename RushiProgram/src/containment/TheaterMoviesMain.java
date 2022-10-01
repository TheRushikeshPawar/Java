package containment;

import java.util.Arrays;
import java.util.Scanner;

public class TheaterMoviesMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Thearter Id : ");
		int id=sc.nextInt();
		System.out.println("Enter The Theater Name : ");
		String name=sc.next();
		
		System.out.println("Enter The Number Of Movies : ");
		int size=sc.nextInt();
		
		Movies mov[]=new Movies[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Movie Id : ");
			int mid=sc.nextInt();
			System.out.println("Enter Movie Name : ");
			String mname=sc.next();
			System.out.println("Enter Movie Collection : ");
			int coll=sc.nextInt();
			System.out.println("Enter Movie Release Year :");
			int yer=sc.nextInt();
			
			Movies m1=new Movies();
			m1.setId(mid);
			m1.setName(mname);
			m1.setBoxOfficeColl(coll);
			m1.setYear(yer);
			
			mov[i]=m1;
			
		}
		for(Movies m:mov)
		{
			System.out.println(m.getId()+"\n"+m.getName()+"\n"+m.getBoxOfficeColl()+"\n"+m.getYear());
		}
	}
}
