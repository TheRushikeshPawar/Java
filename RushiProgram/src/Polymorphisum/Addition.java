package Polymorphisum;

public class Addition {

	void add(int a,int b)
	{
		System.out.println("Additon of Intigers :"+(a+b));
	}
	void add(float a,float b)
	{
		System.out.println("Addtion of decimal numbers :"+(a+b));
	}
	void add(String a,String b)
	{
		System.out.println("Additon of String is :"+(a+b));
	}
	void add(int a,String b,float c)
	{
		System.out.println("Addtion of Diff. Variable is :"+(a+c)+" "+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Addition a1=new Addition();
		a1.add(10, 15);
		a1.add(3.5f, 6.5f);
		a1.add("Ajay", "Vijay");
		a1.add(25, "Rahul", 4.5f);
	}

}
