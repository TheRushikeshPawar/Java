package collectionAssignment1;

import java.util.ArrayList;

public class SizeOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(70);
		a1.add(60);
		
		System.out.println(a1);
		System.out.println("Size of Array List : "+a1.size());
		System.out.println("Array List Contain "+a1.size()+" Elements.");
	}

}
