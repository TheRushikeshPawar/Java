package collectionMovieExample;

import java.util.Comparator;

public class Rating implements Comparator <MovieName>{

	@Override
	public int compare(MovieName o1, MovieName o2) {
		
		return o1.rating.compareTo(o2.rating);

}
}
