package collectionMovieExample;

import java.util.Comparator;

public class BoxCollection implements Comparator<MovieName> {

	
	public int compare(MovieName c1, MovieName c2) {
		return c1.boxCollection.compareTo(c2.boxCollection);
		
	}

}
