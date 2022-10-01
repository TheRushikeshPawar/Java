package exceptionAssignment;

		public class TryFinallyReturn {
			
			public int method()
			{
				int div=0;
				int a=10,b=10;
			try {
				
			div=a/b;
			return div;
			}
			catch (ArithmeticException e)
			{
			return 2;
			}
			finally 
			{
				return 3;
			}
			}
			public static void main(String[] args) {
				
				TryFinallyReturn t1=new TryFinallyReturn();
				System.out.println(t1.method());
		
			}
		
		}
