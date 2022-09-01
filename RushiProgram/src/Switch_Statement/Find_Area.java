package Switch_Statement;

import java.util.Scanner;

public class Find_Area {

	public static void main(String[] args) {
		float r,l,b,h,s;
		// r=redius,l=length,b=bredth,h=hight,s=square;
	Scanner sc=new Scanner(System.in);
	System.out.println("Find Area of :");
	System.out.println("1.Circle :");
	System.out.println("2.Rectangle :");
	System.out.println("3.Traingle :");
	System.out.println("4.Square :");
	System.out.println("Select a Number");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:System.out.println("Enter redius :");
	r=sc.nextInt();
	System.out.println("Area of Circle is :"+((float)3.14*(r*r)));
	break;
	
	case 2:
		System.out.println("Enter the lenght :");
		l=sc.nextInt();
		System.out.println("Enter the breath :");
		b=sc.nextInt();
		System.out.println("Area of Rectngle is :"+(l*b));
	break;
	case 3:
		System.out.println("Enter the Breath :");
		b=sc.nextInt();
		System.out.println("Enter the hight :");
		h=sc.nextInt();
		System.out.println("Area of Trangle is :"+(0.5*(b*h)));
	break;
	case 4:
		System.out.println("Enter the Number :");
		s=sc.nextInt();
	
		System.out.println("Square is:"+(s*s));
	break;
	default:System.out.println("Invalid input");
	
	
	}
	
	}

}
