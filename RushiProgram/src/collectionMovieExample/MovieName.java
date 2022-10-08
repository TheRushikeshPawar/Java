package collectionMovieExample;

public class MovieName  implements Comparable<MovieName> {

	Integer mid,boxCollection;
	String name;
	Float rating;
	
	
	public MovieName(Integer mid,Integer boxCollection,String name,Float rating)
	{
		this.mid=mid;
		this.boxCollection=boxCollection;
		this.name=name;
		this.rating=rating;
	}
	
	public String toString()
	{
		return "Movie ID : "+mid+"\n"+"Movie Name : "+name+"\n"+"BoxOfficeCollection : "+boxCollection+"\n"+"Movie Rating : "+rating+"\n";
	}
	
	public int compareTo(MovieName o)
	{
		return o.name.compareTo("End Game");
	}
	
	
}
