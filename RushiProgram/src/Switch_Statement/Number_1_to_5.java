package Switch_Statement;
import java.util.Scanner;
public class Number_1_to_5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose the Number Between 1 to 5 : ");
	
	int a=sc.nextInt();
	switch(a)
	{
	case 1:
		System.out.println("ONE");
		break;
	case 2:
		System.out.println("TWO");
		break;
	case 3:
		System.out.println("THREE");
		break;
	case 4:
		System.out.println("FOUR");
		break;
	case 5:
		System.out.println("FIVE");
		break;
		default:
			System.out.println("Innvalid Number Entired !!!");
	}

	}

}
