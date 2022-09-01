package For_loop;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int frequency=sc.nextInt();
		
		for(int i=0;i<=9;i++)
		{
			int count=0;
			int temp=frequency;
			
			while (temp>0) {
				int num=temp%10;
				if(num==i)
				{
					count++;
				}
					temp=temp/10;
			}
			if(count>0){
				System.out.println("Frequency of Number "+ i + " : " + count);
			}
		}

	}

}
