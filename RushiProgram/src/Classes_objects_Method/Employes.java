package Classes_objects_Method;

import java.util.Scanner;

public class Employes {
	
	int id ,salary;
	long contact;
	String name,department;
	
	void employedetails(int i,String n,String d,int m,int s,long c)
	{
		id=i;
		name=n;
		department=d;
		salary=s;
		contact=c;
	}
	
	void displayemploye()
	{
		System.out.println(id+" "+name+" "+department+" "+salary+" "+contact);
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Employe Details :");
		
		

	}

}
