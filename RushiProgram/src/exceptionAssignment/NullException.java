package exceptionAssignment;

public class NullException {
	
	void oneScenario()
	{
		Object ref=new Object();
		ref.toString();
	}
	void secondScenario()
	{
		String pr=null;
		try
		{
			if(pr.equals("xyz"))
			{
				System.out.println("Same");
			}
			else
			{
				System.out.println("Not Same");
			}
		}
		catch (NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}

	}
	void thirdScenario()
	{
		try
		{
			int a[]=new int [5];
		a[5]=30/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception Occers");
	}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception occurs");
		}
		System.out.println("Done");
	}
		public static void main(String []args ) {
			
			NullException n1=new NullException();
			n1.oneScenario();
			n1.secondScenario();
			n1.thirdScenario();
		}

}
