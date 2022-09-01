package Day_2;
import java.util.Scanner;
public class Temprature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Celcius in to Faheraheit : ");
		float c=sc.nextFloat();
		float f;
		// c=celsius , f=faheranheit;
		f=((c*9)/5)+32;
		System.out.println("Fahrenheit :"+f);
	}

}
