package demoWhileLoop;
import java.util.Scanner;
public class Maxi_Mini_Digits {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter The Number :");
		     int num=sc.nextInt();
		     int mini=num%10;
		     int maxi=num%10;
		     while(num!=0)
		{
		int r=num%10;
		if (r<mini) {
			
			mini=r;
		}
		
		if(r>maxi) {
		maxi=r;
		}
		num=num/10;	
		}
		System.out.println("Maximum Digit is :"+maxi);
		System.out.println("Mininum Digit is :"+mini);
			}
		
		}
