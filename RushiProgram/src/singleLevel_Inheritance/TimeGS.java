package singleLevel_Inheritance;

public class TimeGS extends DateGS {
	
	private int hours,minit,second;
	
	public void setHours(int hrs)
	{
		this.hours=hrs;
	}
	public void setMinit(int min)
	{
		this.minit=min;
	}
	public void setSecond(int sec)
	{
		this.second=sec;
	}
	
	
	public int getHours()
	{
		return hours;
	}
    public int getMinit()
    {
    	return minit;
    }
    
    public int getSecond()
    {
    	return second;
    }
}
