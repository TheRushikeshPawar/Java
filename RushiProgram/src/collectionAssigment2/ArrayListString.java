package collectionAssigment2;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("India");
		a1.add("Austrelia");
		a1.add("West Indies");
		a1.add("Pakisthan");
		a1.add("USA");
		a1.add("Japan");
		a1.add("Bangladesh");
		
		
		
		System.out.println("Unsorted ArrayList");
		System.out.println(a1);
		
		System.out.println();
		
		for(int i=0;i<a1.size();i++)
		{
			for(int j=i;j<a1.size();j++)
			{
				if(a1.get(i).compareTo(a1.get(j))>0)
				{
					String temp=a1.get(i);
					a1.set(i, a1.get(j));
					a1.set(j, temp);
				}
			}
		}
		System.out.println("Sorted ArrayList");
		System.out.println(a1);
	}

}
