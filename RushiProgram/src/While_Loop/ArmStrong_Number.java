package While_Loop;

import java.util.Scanner;

public class ArmStrong_Number {

				public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int num=sc.nextInt();
			int cnt=0,temp;
			temp=num;
			
			while(temp!=0)
			{
				cnt++;
				temp=temp/10;
			}
			temp=num;
			int sum=0;
			
			while(temp!=0)
			{
				int product=1;
				int r=temp%10;
				
				for(int i=1;i<=cnt;i++)
				{
					product=product*r;
				}
				sum=sum+product;
				temp=temp/10;
			}
			if(cnt==temp)
			{
				System.out.println("it is a ArmStrong Number");
			}
				else
				System.out.println("it is not ArmStrong Number");
		}		
	}
