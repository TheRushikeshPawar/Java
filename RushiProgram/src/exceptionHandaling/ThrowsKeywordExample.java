package exceptionHandaling;

public class ThrowsKeywordExample {             // Called Method
	
	int getStringLength(String s) throws NullPointerException
	{
		if(s==null)
		{
			throw new NullPointerException("Enter a Null String");
		}
		return s.length();
	}

	public static void main(String[] args) {              // Calling Method
		
		ThrowsKeywordExample e1=new ThrowsKeywordExample();
		
		System.out.println(e1.getStringLength("Mumbai"));
		try
		{
		System.out.println(e1.getStringLength(null));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(e1.getStringLength("Pune"));
		System.out.println(e1.getStringLength("Maharashtra"));
		System.out.println(e1.getStringLength("India"));
		

	}

}
