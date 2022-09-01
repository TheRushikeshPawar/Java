package While_Loop;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number :");
 int num=sc.nextInt();
 int mid,c=2;        //c=Starting
   mid=num/2;
 
 while(c<=mid)
 {
	 if(num%c==0)
	 {
	 break;
	 }
	 c++;
 }

	 if(c>mid)
	 
		 System.out.println(" It is a Prime Number ");
		 
	 else 
         System.out.println(num + " is not a prime number");
	 }
	
	 
 }
	

	
