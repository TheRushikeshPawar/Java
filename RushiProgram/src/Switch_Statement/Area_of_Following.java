package Switch_Statement;

import java.util.Scanner;

public class Area_of_Following {

	public static void main(String[] args) {
		float a,r,l,b,h,s;
		// r=redius,l=length,b=bredth,h=hight,s=square ,a=side;
	Scanner sc=new Scanner(System.in);
	System.out.println("Find Area of :");
	System.out.println("1.Circle :");
	System.out.println("2.Square :");
	System.out.println("3.Right Angle Traingle :");
	System.out.println("4.Rectangle :");
	System.out.println("5.Circumfrance of the Circle :");
	System.out.println("6.Perimeter of Square :");
	System.out.println("Select a Number");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("Enter redius :");
		r=sc.nextInt();
		System.out.println("Area of Circle is :"+((float)3.14*(r*r)));
		break;
	case 2:
		System.out.println("Enter the Number :");
		s=sc.nextInt();
	
		System.out.println("Square is:"+(s*s));
		break;
	case 3:
		System.out.println("Enter The hight :");
		h=sc.nextFloat();
		System.out.println("Enter The Base :");
		b=sc.nextFloat();
		System.out.println("Area of Right Angle Traingle is :"+(h*b)/2);
		break;
	case 4:
		System.out.println("Enter the Length :");
		l=sc.nextFloat();
		System.out.println("Enter The Bredth :");
		b=sc.nextFloat();
		System.out.println("Area of Rectangle is :"+(l*b));
		break;
	case 5:
		System.out.println("Enter The Radius :");
		r=sc.nextFloat();
		System.out.println("Circumfrance of the circle is :"+2*(3.14)*r);
		break;
	case 6:
		System.out.println("Enter The Side :");
		a=sc.nextFloat();
		System.out.println("Perimeter of Square is :"+(4*a));
		default:
			System.out.println("invalis input");
		
		
	
	}

	}

}
