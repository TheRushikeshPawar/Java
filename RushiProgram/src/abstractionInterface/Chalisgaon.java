package abstractionInterface;

public class Chalisgaon extends ChalisgaonMainBranch implements College ,Transport{
	
	public void departments()
	{
		System.out.println("4 Department in College ");
	}
	
	public void library() {
		System.out.println("Big Library in our Branch");
	}
	
	public void laboratory()
	{
		System.out.println("All department Laboratory Available");
	}

	public void canteen()
	{
		System.out.println("Canteen Also Available ");
	}
	
	public void classRoom()
	{
		System.out.println("12 class Room Available");
	}
	
	public void transport()
	{
		System.out.println("Transportation Available ");
	}
}
