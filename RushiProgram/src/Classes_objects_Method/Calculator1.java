package Classes_objects_Method;

public class Calculator1 {
	
				
			void addtion(int a,int b)
			{
				System.out.println("Addition is :"+(a+b));
			}
			void substraction(float a,float b)
			{
				System.out.println("Substraction is :"+(a-b));
			}
			void multiplication(int a,int b)
			{
				System.out.println("Multiplication is :"+(a*b));
			}
			void division(int a,int b)
			{
				System.out.println("Division is :"+(a/b));
			}
			void power(int a,int b)               
			{
				int product=1;
				
			    for (int c=1;c<=b;c++) 
			    {
			     product=product*a;
			    }
			
				System.out.println("Addition is :"+product);
			}
			
				public static void main(String[] args) {
				Calculator1 c1=new Calculator1();
			c1.addtion(20, 25);
			c1.substraction(8.9f, 5.3f);
			c1.multiplication(12, 12);
			c1.division(81, 9);
			c1.power(5, 3);
					
				}
			
			}
