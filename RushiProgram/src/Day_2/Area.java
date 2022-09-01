package Day_2;
import java.util.Scanner;
public class Area{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Radius Of Circle");

		float r=sc.nextFloat();
		float d,c,a;
		
		// r=radius,d=diameter,c=circumfrance,a=area;
		d=2*r;
		c=2*(float)3.14*r;
		a=(float)3.14*(r*r);
		System.out.println("Dimeter      = "+ d +" units");
		System.out.println("Circumfrance = "+ c +" units");
		System.out.println("Area         = "+ a +" units");
	}

}
