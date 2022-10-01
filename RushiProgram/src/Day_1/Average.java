package Day_1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.println("Average Of Number :");
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		int sum=a+b;
		int avg=sum/5;
		System.out.println("Sum of the Number :"+sum);
        System.out.println("Average of The Number is :"+avg);
	}

}
