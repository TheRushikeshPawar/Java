package collectionAssignment1;

import java.util.ArrayList;

public class DayRemoves {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("Sunday");
		a1.add("Monday");
		a1.add("Tuesday");
		a1.add("Wednesday");
		a1.add("Thursday");
		a1.add("Friday");
		a1.add("Saturday");
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).length()>=7)
			{
				System.out.println(a1.get(i)+" ");
			}
			else
			{
				a1.remove(i);
			}
		}
	}

}
