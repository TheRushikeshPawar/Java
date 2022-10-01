package exceptionAssignment;

public class IndexOutOfBound {

	public static void main(String[] args) {
		
		String s="Java Program";
		int arr[]= {1,3,4,5,6,7,8,9,2};
			
		try {
			for(int i=0;i<s.length();i++)
			System.out.println(s.charAt(12));
		}
		catch (StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		try {
			System.out.println(arr[12]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Language");
		System.out.println(s.charAt(14));
		
	}
		

}

