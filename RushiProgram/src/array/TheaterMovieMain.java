package array;

public class TheaterMovieMain {

	public static void main(String[] args) {
		
		Movie m=new Movie();
		
		m.setName("End Game ");
		m.setRating(4);
		m.setTickitprice(250);
		
	   Theater t=new Theater();
	   t.setId(101);
	   t.setTheaterName("Inox");
	   t.setLocation("Jalgaon");
	   t.setMovie(m);
	   
	   System.out.println(t.getMovie().getName()+" "+t.getMovie().getRating()+ " "+t.getMovie().getTickitprice());
	   System.out.println();
	   System.out.println(t.getId()+" "+t.getTheaterName()+" "+t.getLocation()+" "+t.getLocation());
	   

	}

}
