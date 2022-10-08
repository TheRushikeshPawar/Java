package collectionMovieExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainSorting {

	public static void main(String[] args) {
		
       ArrayList<Movie> a=new ArrayList<Movie>();
		
		Movie m1=new Movie(101, 30000000, "Avengers", 7f);
		Movie m2=new Movie(102, 40000000, "Age Of Ultron", 7f);
		Movie m3=new Movie(103, 25000000, "Infinity War", 8f);
		Movie m4=new Movie(104, 45000000, "End Game", 9f);
		Movie m5=new Movie(105, 20000000, "Iron Man", 8.3f);
		
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		a.add(m5);
		
		Iterator<Movie> n1=a.iterator();
		while(n1.hasNext())
		{
			System.out.println(n1.next());
		}
		
		System.out.println("Sorting By Name :");
		Collections.sort(a);
		Iterator<Movie> n2=a.iterator();
		while(n2.hasNext())
		{
			System.out.println(n2.next());
		}
		
	}

}
