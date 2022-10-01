package demoWhileLoop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");

		int i =1;
		int num=sc.nextInt();
        while(i<=10)
        {
            System.out.println(num*i);
         i++;
			
	}

}
}