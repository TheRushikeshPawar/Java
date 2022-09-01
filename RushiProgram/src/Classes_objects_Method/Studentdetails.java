package Classes_objects_Method;

import java.util.Scanner;

public class Studentdetails {
	
			int id;String name;
			String department;
			
			float subject(int m1,int m2,int m3,int m4,int m5)
			{
				float total=m1+m2+m3+m4+m5;
				System.out.println("Total of all subject :"+total);
				return total;
			}
			float percentage(float total)
			{
				float percent=total/5;
				System.out.println("Persentage of Marks :"+percent);
				return percent;
			}
			float grade(float total)
			{
				float per=percentage(total);         //float per=s1.percentage(total);
				if (per>80)
				{
					System.out.println("Distinction");
			     }
				else if (per<80 && per>70)
				{
					System.out.println("Grade A");
				}
				else if(per<70 && per>60)
				{
					System.out.println("Grade B");
				}
				else if(per>60 && per<50)
				{
					System.out.println("Grade C");
				}
				else 
					System.out.println("Grade D");
				return per;
			}
			
			
			void details(int i,String n,String d)
			{
			id=i;
			name=n;
			department=d;
			}
			void displaydetails()
			{
				System.out.println(id+":"+name+":"+department+":");
			}
		
	public static void main(String[] args) {
			int m1,m2,m3,m4,m5;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Student Details :");
			
			Studentdetails s1=new Studentdetails();
			System.out.println("Enter The Student Id Number :");
		    int	id=sc.nextInt();
			System.out.println("Enter Student Name :");
			String name=sc.next();
			System.out.println("Enter The Department :");
			String department=sc.next();
			
			System.out.println("Enter 5 sub Marks :");
			
			 m1=sc.nextInt();
			 m2=sc.nextInt();
			 m3=sc.nextInt();
			 m4=sc.nextInt();
			 m5=sc.nextInt();
			 
			 s1.details(id, name, department);
			 s1.displaydetails();
			 
			 System.out.println();
			 
			 float total1=s1.subject(m1, m2, m3, m4, m5);
			 s1.grade(total1);
			 
			 System.out.println();
			 
			 Studentdetails s2=new Studentdetails();
				System.out.println("Enter The Student Id Number :");
			    id=sc.nextInt();
				System.out.println("Enter Student Name :");
				name=sc.next();
				System.out.println("Enter The Department :");
				department=sc.next();
				
				System.out.println("Enter 5 sub Marks :");
				
				 m1=sc.nextInt();
				 m2=sc.nextInt();
				 m3=sc.nextInt();
				 m4=sc.nextInt();
				 m5=sc.nextInt();
				 
				 s2.details(id, name, department);
				 s2.displaydetails();
				 
				 System.out.println();
				 
				 float total2=s2.subject(m1, m2, m3, m4, m5);
				 s2.grade(total2);
				 
			    System.out.println();
			    
			    Studentdetails s3=new Studentdetails();
				System.out.println("Enter The Student Id Number :");
			    id=sc.nextInt();
				System.out.println("Enter Student Name :");
				name=sc.next();
				System.out.println("Enter The Department :");
				department=sc.next();
				
				System.out.println("Enter 5 sub Marks :");
				
				 m1=sc.nextInt();
				 m2=sc.nextInt();
				 m3=sc.nextInt();
				 m4=sc.nextInt();
				 m5=sc.nextInt();
				 
				 s3.details(id, name, department);
				 s3.displaydetails();
				 
				 System.out.println();
				 
				 float total3=s3.subject(m1, m2, m3, m4, m5);
				 s3.grade(total2);
			 
			 
			 
			 
			}
		
		}
