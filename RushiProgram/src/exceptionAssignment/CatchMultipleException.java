package exceptionAssignment;

public class CatchMultipleException {

	public static void main(String[] args) {
		
		CatchMultipleException ce=null;
		int a=12,b=2;
		int arr[]= {1,2,3,4,5,6,7,8};
		
		String s=null;
		
		try
		{
			System.out.println("Division is "+a/b);
			System.out.println("Element At Index :"+arr[5]);
			ce.toString();
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException| NullPointerException e )
		{
			e.printStackTrace();
		}
		
	System.out.println("Done");
	}

}
