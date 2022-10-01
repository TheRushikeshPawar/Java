package array;

public class Theater {

	private int id;
	private String theaterName;
	private String location;
	private Movie m;
	
	public void setId(int id)
	{
		this.id=id;
	
	}
	public void setTheaterName(String theaterName)
	{
		this.theaterName=theaterName;
	}
	public void setLocation(String Location)
	{
		this.location=location;
	}
	
	public int getId()
	{
		return id;
	}
	public String getTheaterName()
	{
		return theaterName;
	}
	public String getLocation()
	{
		return location;
	}
	
	public void setMovie(Movie m)
	{
		this.m=m;
	}
	public Movie getMovie()
	{
		return m;
	}

}
