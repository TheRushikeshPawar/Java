package collectionAssignment1;

import java.util.ArrayList;

public class WithoutGeneric {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		a1.add("Rushi");
		a1.add(10);
		a1.add(20);
		a1.add(30.0f);
		a1.add(null);
		a1.add("Pawar");
		
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("Vijay");
		a2.add("Rahul");
		
		System.out.println(a2);
		
		ArrayList a3=new ArrayList();
		a3.add(10);
		a3.add("Rushi");
		System.out.println(a3);
		
		

	}

}
