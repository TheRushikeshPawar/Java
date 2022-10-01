package exceptionAssignment;

import java.io.IOException;

	public class ThrowAndThrows{
	
		void method() throws IOException
		{
			throw new IOException("System Error");
		}
		void method1() throws IOException
		{
			method();
		}
		void method2()
		{
			try
			{
				method1();
			}
			catch(Exception e)
			{
				System.out.println("Exception Handeled in Catch Block ");
			}
		}
		public static void main(String[] args) {
			
			ThrowAndThrows obj=new ThrowAndThrows();
			obj.method2();
			System.out.println("The Normal Flow Condition ");
	
		}
	
	}
