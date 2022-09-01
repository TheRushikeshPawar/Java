package arrayOfObject;

public class Movie {
	
	int movieId,year,boxOfficeColl;            //year= movie release year
	String name,producer;                          // name=movie name
	
	Movie(int movieId,String name,int year,int boxOfficeColl,String producer)
	{
		this.movieId=movieId;
		this.name=name;
		this.year=year;
		this.boxOfficeColl=boxOfficeColl;
		this.producer=producer;
	}
	
	public String toString()
	{
		return movieId+" "+name+" "+year+" "+boxOfficeColl+" "+producer;
	}

}
