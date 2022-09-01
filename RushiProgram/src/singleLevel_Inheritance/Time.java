package singleLevel_Inheritance;

public class Time extends MyDate{
	
	int hrs,min,sec;
	
	public void setTime(int hrs,int min,int sec)
	{
		this.hrs=hrs;
		this.min=min;
		this.sec=sec;
	}
	
	void display()
	{
		System.out.println(+dd+"/"+mm+"/"+yyyy+" : "+hrs+":"+min+":"+sec);
	}

}
