package collectionMovieExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MoviesDetailMain {

	public static void main(String[] args) {
		
		
		ArrayList<MovieName> a1=new ArrayList<MovieName>();
		
		MovieName m1=new MovieName(101, 30000000, "Avengers", 7f);
		MovieName m2=new MovieName(102, 40000000, "Age Of Ultron", 7f);
		MovieName m3=new MovieName(103, 25000000, "Infinity War", 8f);
		MovieName m4=new MovieName(104, 45000000, "End Game", 9f);
		MovieName m5=new MovieName(105, 20000000, "Iron Man", 8.3f);
		
		a1.add(m1);
		a1.add(m2);
		a1.add(m3);
		a1.add(m4);
		a1.add(m5);
		
		
		System.out.println("Sort By Rating :");
		Collections.sort(a1, new Rating());
		
		Iterator<MovieName> id1=a1.iterator();
		while(id1.hasNext())
		{
			System.out.println(id1.next());
		}
		
		System.out.println("Rating Grater than 7 :");
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).rating<=7)
			{
				a1.remove(i);
				i--;
			}
			
		}
		System.out.println(a1);

		System.out.println("Only End Game Movie Details Print :");
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).name.equals("End Game"))
			{
				System.out.println(a1.get(i));
			}
		}
		
		System.out.println("Sorting By Box Office Colletion :");
		Collections.sort(a1, new BoxCollection());
		Iterator<MovieName> id2=a1.iterator();
		while(id2.hasNext())
		{
			System.out.println(id2.next());
		}
		
	}

}
