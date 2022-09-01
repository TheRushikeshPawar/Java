package NestedForLoop;
import java.util.Scanner;
public class PrimeNumber_400_to_300 {
	public static void main(String[] args) {
		System.out.println("Prime Number Between 400 to 300 :");
		int j;
	       for (int i=400; i>=300; i--)         
	       { 		  	    
	          for(j=2;j<=i/2;j++)
		  {
	             if(i%j==0)
		     break;
		     
	       }
	       
		  if(j>i/2) 
	       	
	       System.out.println(i);
		  }}
	   }
	