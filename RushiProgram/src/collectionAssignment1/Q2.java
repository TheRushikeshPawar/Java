package collectionAssignment1;

import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		
		ArrayList <String> a1=new ArrayList<String>();
		
		a1.add("Akshay");
		a1.add("Vijay");
		a1.add("Rushi");
		
		//By Iterator
		System.out.println("Printing by Iterator");
		System.out.println(a1);
		System.out.println();
		
		//By for loop
		System.out.println("Printing by for loop");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i)+" ");
		}
		
		//by using enhance loop
		
	System.out.println();
	System.out.println("By Using enhanced");
	for(String a:a1)
	{
		System.out.println(a+" ");
	}
	}

}
