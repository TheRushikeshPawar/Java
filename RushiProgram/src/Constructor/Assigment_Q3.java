package Constructor;

import java.util.Scanner;

public class Assigment_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int r=sc.nextInt();
		
		
		/* for(int i=r-1;i>=1;i--) 
		 * {
		 * for(int j=1;j<=i;j++) 
		 * {
		 * System.out.print((char)+(j+64)); 
		 * } 
		 * System.out.println(); 
		 * } 
		 * for(int i=2;i<=r-1;i++) 
		 * {
		 *  for(int j=1;j<=i;j++) 
		 *  {
		 *   System.out.print((char)+(j+64)); 
		 *   }
		 * System.out.println(); 
		 * } */ 
		 
			
	 
	        for (int i = r; i >= 1; i--)
	        {
	             for (int k=1; k<=i*2; k++)
	            {
	                System.out.print(" ");
	            }
	 
	            for (int j = i; j<= r; j++)          
	            {
	                System.out.print(j+" ");
	            }
      
	            for (int j=r-1; j>= i; j--)
	            {               
	                System.out.print(j+" ");            
	            }
	             
	            System.out.println();
	 
			
		}

	}
	

}
