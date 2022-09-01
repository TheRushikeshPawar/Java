package For_loop;

import java.util.Scanner;

public class SimpleForLoop {

			public static void main(String[] args) {
		int limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		limit=sc.nextInt();
		int i;
		for(i=1;i<=limit;i++)
		{
			System.out.println(i+" ");
		}
			
			System.out.println("Done");
		}
		}