package array;

import java.util.Scanner;

public class Equality {
	
	public void equalArray(int a[],int b[])
	{
		int cnt = 0;
			if (a.length==b.length)
			{
				for(int i=0;i<a.length;i++)
				{
					if(a[i]==b[i])
					{
						cnt++;
					}
					else
					{
						System.out.println("Elements Are Differant Not Equal ");
						break;
					}
				}
				if(cnt==a.length)
				{
					System.out.println("Both Are Equal Array");
				}
			}
			else 
			{
				System.out.println("Both are NOT Equal Array");
			}
		}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Length :");
		int sizeA=sc.nextInt();
		int a[]=new int[sizeA];
		System.out.println("Enter First Array Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Second Array Length :");
		int sizeB=sc.nextInt();
		int b[]=new int[sizeB];
		System.out.println("Enter The Second Array Elements :");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}

		Equality e=new Equality();
		e.equalArray(a, b);
		
		
	}

}
