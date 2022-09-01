package Polymorphisum;

public class Area {
	
	void area(int a)      
	{
		int sqr=a*a;
		System.out.println("Area of Square is :"+sqr);
	}
	
	void area(float r)      //r=radius
	{
		float pi=3.14f;
		float circule=pi*r*r;
		System.out.println("Area of Circule is :"+circule);
	}
	
	void area(float l,float b)     //l=length b=breath
	{
		float rct=l*b;
		System.out.println("Area of Rectangle is :"+rct);
		
	}
	
	void area(int h,float b)     //b=base h=height
	{
		float triangle=h*b/2;
		System.out.println("Area of Traingle :"+triangle);
	}
	

	public static void main(String[] args) {
		
		Area a1=new Area();
		a1.area(12);
		a1.area(3.5f);
		a1.area(3.4f, 5f);
		a1.area(5, 3.5f);

	}

}
