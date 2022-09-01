package While_Loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int fact=1;
		int i =1;
		int num=sc.nextInt();
        while(i<=num)
        {
        fact=fact*i;     
         i++;
			
	}
        System.out.println("Factorial is :"+fact);

	}

}
