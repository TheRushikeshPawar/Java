package collectionMovieExample;

public class Movie implements Comparable<Movie>{
	
	Integer mid,boxCollection;
	String name;
	Float rating;
	
	public Movie(Integer mid,Integer boxCollection,String name,Float rating)
	{
		//super();
		this.mid=mid;
		this.boxCollection=boxCollection;
		this.name=name;
		this.rating=rating;
	}
	
	public String toString()
	{
		return "Movie ID : "+mid+"\n"+"Movie Name : "+name+"\n"+"Box OfficeCollection : "+boxCollection+"\n"+"Rating : "+rating+"\n";
	}
	@Override
	public int compareTo(Movie o) {
		
		return this.name.compareTo(o.name);
	}
	
	

}
