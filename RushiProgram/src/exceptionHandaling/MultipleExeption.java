package exceptionHandaling;

public class MultipleExeption {
	public static void main(String[] args) {
	
	MultipleExeption me=null;
	
	int arr[]= {1,2,3,4,54,32,5,10,67};
	
	String s=null;
	
	int a=100,b=2;
	
	try
	{
		System.out.println("Division is : "+(a/b));
		System.out.println("Elements at Index : "+arr[6]);
		me.toString();
	}
	
/*	catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e )
	{
		e.printStackTrace();                 // we can try this way also multiple catch
		//System.out.println(e);
	}   */
	
	
	
/*	catch(ArithmeticException e)             //Multiple catch block
	{
		e.printStackTrace();
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}	*/
	
	finally
	{
		System.out.println("Finally block are Executed Irrespective of any Exception");
	}

	}

}
