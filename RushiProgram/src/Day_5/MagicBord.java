package Day_5;

import java.util.Scanner;

public class MagicBord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 diff input ASCII ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();

		 char w=(char)a;
		 char x=(char)b;
		 char y=(char)c;
		 char z=(char)d;
		 
		  System.out.println();
		  System.out.print(a);
		 System.out.println("_"+w);
		 System.out.print(b);
		 System.out.println("_"+x);
		 System.out.print(c);
		 System.out.println("_"+y);
		 System.out.print(d);
		 System.out.println("_"+z);
			

	}

}
