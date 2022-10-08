package collectionAssignment1;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println(a1);
		System.out.println();
		a1.set(2, 100);
		System.out.println("After Replacing Elements With 100");
		System.out.println(a1);

	}

}
