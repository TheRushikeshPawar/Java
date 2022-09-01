package Switch_Statement;
import java.util.Scanner;
public class EvenOdd_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Intiger Number :");
		int num=sc.nextInt();
		
		switch(num % 2)
		{
		case 0:
			System.out.println(num +" is Even Number");
			break;
		case 1:
			System.out.println(num +" is Odd Number");
		}

	}

}
