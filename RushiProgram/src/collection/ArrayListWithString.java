package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListWithString {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("Rushi");
		al.add("Nazeer");
		al.add("Sushant");
		al.add("Suraj");
		al.add("Nivrutti");
		
		al.add(2,"Shivraja");
		al.add("Jitendra");
		System.out.println(al);
		
		/*
		 * LinkedHashSet<String> hs=new LinkedHashSet<String>(al);
		 * System.out.println(hs);
		 * 
		 * ArrayList<String> al2=new ArrayList<String>(al); al2.add("Priya");
		 * al2.add("Gauri");
		 * 
		 * System.out.println(al2);
		 */
		
		//addAll
		
		ArrayList<String> al2 =new ArrayList<String>();

		al2.add("Priya");
		al2.add("Gauri");
		
		al2.addAll(2, al);
		System.out.println(al2);
	}

}
