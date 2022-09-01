package Classes_objects_Method;

import java.util.Scanner;

public class Box {
	
	void volume(int l,int w,int h)
	{
		int volume;      // l=length,w=width,h=hight;
		volume=l*w*h;
	   System.out.println("Volume of Box in cm :"+volume+" cm");
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length cm :");
    	int	l=sc.nextInt();
    	System.out.println("Enter the width cm :");
    	int w=sc.nextInt();
    	System.out.println("Enter the hight cm:");
    	int h=sc.nextInt();
    	
    	Box b1=new Box();
    	b1.volume(l, w, h);

	}

}
