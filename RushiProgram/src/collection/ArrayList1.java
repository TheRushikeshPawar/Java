package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		//generic(type safety)->It will check data type at compile time
		
				ArrayList<Integer> al=new ArrayList<Integer>();
				ArrayList<String> al2=new ArrayList<String>();
				
				al.add(10);
				al.add(20);
				al.add(30);
				al.add(40);
				al.add(50);
				al.add(40);
				
				
				System.out.println(al);
				
				Collections.sort(al);
				
				System.out.println(al);
				

				al2.add("Ram");
				al2.add("Siya");
				al2.add("Abhay");
				al2.add("Leena");
				
				
		        System.out.println(al2);
				
				Collections.sort(al2);
				
				System.out.println(al2);
				

	}

}
