package Classes_objects_Method;

import java.util.Scanner;

public class Reversed {

	
	void reversnumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
		
			int a=num%10;
			rev=rev*10+a;
			num=num/10;
		}
		System.out.println("Reverse digits are :"+rev);
	}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Digits :");
	int num=sc.nextInt();
	
	Reversed r1=new Reversed();
    r1.reversnumber(num);

	}

}
