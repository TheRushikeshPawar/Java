package Classes_objects_Method;

import java.util.Scanner;

public class Student {
	int id ,marks;
	String name,department;
	
	void studentdata(int i,String n,String d,int m)
	{
		id=i;
		name=n;
		department=d;
		marks=m;
	}
	
	void studentdetails()
	{
		System.out.println(id+" "+name+" "+department+" "+marks);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Student Details :");
		
		Student s1=new Student();
		System.out.println("Enter The Student Id Number :");
	    int	id=sc.nextInt();
		System.out.println("Enter Student Name :");
		String name=sc.next();
		System.out.println("Enter The Department :");
		String department=sc.next();
		System.out.println("Enter The Marks of Student :");
		int marks=sc.nextInt();
		
		s1.studentdata(id, name, department, marks);
		s1.studentdetails();
		
		System.out.println();
		
		Student s2=new Student();
		System.out.println("Enter The Student Id Number :");
	    id=sc.nextInt();
		System.out.println("Enter Student Name :");
		name=sc.next();
		System.out.println("Enter The Department :");
		department=sc.next();
		System.out.println("Enter The Marks of Student :");
		marks=sc.nextInt();
		
		s2.studentdata(id, name, department, marks);
		s2.studentdetails();

	}

}
