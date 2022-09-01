package array;

import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of Array : ");
		int size=sc.nextInt();
		int arr[]=new int [size];
		
		System.out.println("Enter The Elements of Array : ");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		Addition a1=new Addition();
		a1.additionArrays(arr, size);
		
	}

}
