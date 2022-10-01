package exceptionAssignment;

public class FinallyReturnBlock {
	public int method()
	{
	
	int a=12,b=12;
	int div=0;
	try
	{
		div=a/b;
		return div;
	}
	catch(ArithmeticException e) 
	{
		
	return 2;
}
finally
{
	return 4;
}
}

	public static void main(String[] args) {
		
		FinallyReturnBlock fr=new FinallyReturnBlock();
		System.out.println(fr.method());
	}
}
