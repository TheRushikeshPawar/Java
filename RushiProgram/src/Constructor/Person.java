package Constructor;

import java.util.Scanner;

public class Person {
				int id,age;
				String name,address,email;
				
				Person(int i,String n,int a,String ad,String e)
				{
					id=i;
					name=n;
					age=a;
					address=ad;
					email=e;
				}
				public String toString()    
				{
				return id+"\n "+name+"\n "+age+"\n "+address+"\n "+email;
				}
				
				void displaydetails()
				{
					
					System.out.println();
					/*
					 * System.out.println("Person ID :"+id);
					 * System.out.println("Person Name :"+name);
					 * System.out.println("Person Age :"+age);
					 * System.out.println("Person Address :"+address);
					 * System.out.println("Person Mail :"+email);
					 */
				}
			
			
				public static void main(String[] args) {
					  
				
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter The Person Details :");
					System.out.println("Enter Person Id :");
					int id=sc.nextInt();
					System.out.println("Enter Person Name :");
					String name=sc.next();
					System.out.println("Enter Person Age :");
					int age=sc.nextInt();
					System.out.println("Enter Person Address :");
				String address=sc.next();
				System.out.println("Enter Person Email :");
				String email=sc.next();
					
				System.out.println();
				
				Person p1=new Person(id,name,age,address,email);
				p1.displaydetails();
				
				System.out.println("--------------------------------------");
				
				System.out.println("Enter The Person Details :");
				System.out.println("Enter Person Id :");
				id=sc.nextInt();
				System.out.println("Enter Person Name :");
				name=sc.next();
				System.out.println("Enter Person Age :");
				age=sc.nextInt();
				System.out.println("Enter Person Address :");
			address=sc.next();
			System.out.println("Enter Person Email :");
			email=sc.next();
			
			System.out.println();
			
				Person p2=new Person(id,name,age,address,email);
				p2.displaydetails();
				
		  System.out.println("-------------------------------------");
				
				System.out.println("Enter The Person Details :");
				System.out.println("Enter Person Id :");
				id=sc.nextInt();
				System.out.println("Enter Person Name :");
				name=sc.next();
				System.out.println("Enter Person Age :");
				age=sc.nextInt();
				System.out.println("Enter Person Address :");
			   address=sc.next();
			     System.out.println("Enter Person Email :");
			    email=sc.next();
			    System.out.println();
			
				Person p3=new Person(id,name,age,address,email);
				p3.displaydetails();
				
				}
			
			}
