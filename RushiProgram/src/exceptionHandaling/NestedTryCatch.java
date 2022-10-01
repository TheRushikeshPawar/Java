package exceptionHandaling;

public class NestedTryCatch {

	public static void main(String[] args) {
		NestedTryCatch ne=null;
		
		int arr[]= {1,2,3,45,56,7,87,65,9};
		
		String s=null;
		
		int a=100,b=0;
		
		try 
		{
			try
			{
				try
				{
					System.out.println("Division is : "+a/b);
				}
				catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
				System.out.println("Element At Index :"+arr[15]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
		  ne.toString();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
		

	}
	

}
