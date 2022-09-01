package Classes_objects_Method;

import java.util.Scanner;

public class RetuenValueExample {
	
	int subject(int m1,int m2,int m3,int m4,int m5)
	{
		int total=(m1+m2+m3+m4+m5);
		System.out.println("Total marks is :"+total);
		return total;
	}
	
	float persentage(float total)
	{
		float percent=total/5;
		System.out.println("Percentage of marks:"+percent);
		return percent;
	}
	void grade(float total)
	{
		float per=persentage(total);      //float per=r1.persentage(total);
		if (per>80)
		{
			System.out.println("Distinction");
	     }
		else if(per<80 && per>65)
		{
			System.out.println("Grade A");
		}
		else if(per<65 && per>55)
		{
			System.out.println("Grade B");
		}
		else if (per<55 && per>40)
		{
			System.out.println("Grade C");
		}
	}

	public static void main(String[] args) {
	 int m1,m2,m3,m4,m5;
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 5 Sub Marks :");
	 
	 m1=sc.nextInt();
	 m2=sc.nextInt();
	 m3=sc.nextInt();
	 m4=sc.nextInt();
	 m5=sc.nextInt();
	 
	 RetuenValueExample r1=new RetuenValueExample();
	int total=r1.subject(m1, m2, m3, m4, m5);
	
	   //float per=r1.persentage(total);
	r1.grade(total);              //r1.grade(per);
	
	
	}

}
