package containment;

import java.util.Arrays;
import java.util.Scanner;

public class PersonIdproofMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of Persons : ");
		int psize=sc.nextInt();
		
		Person1 pr[]=new Person1[psize];
		
		for(int i=0;i<pr.length;i++)
		{
			System.out.println("Enter The Person Id : ");
			int id=sc.nextInt();
			System.out.println("Enter The Person Name : ");
			String name=sc.next();
			System.out.println("Enter The Person Contact : ");
			String contact=sc.next();
			
			
			System.out.println("Enter The Number of Id Proof : ");
			int idsize=sc.nextInt();
			
			Idproof ip[]=new Idproof[idsize];
			
			for(int j=0;j<ip.length;j++)
			{
				System.out.println("Enter Id Name : ");
				String idname=sc.next();
				System.out.println("Enter Id Number : ");
				String idNo=sc.next();
				
				Idproof id1=new Idproof();
				id1.setId(idNo);
				id1.setName(idname);
				
				ip[j]=id1;	
			}
			Person1 p1=new Person1();
			p1.setId(id);
			p1.setName(name);
			p1.setContact(contact);
			p1.setIdp(ip);
			
			pr[i]=p1;
			
		}
		for(Person1 p:pr )
		{
			System.out.println(p.getId()+"\n"+p.getName()+"\n"+p.getContact()+"\n");
			System.out.println(Arrays.toString(p.getIdp()));
		}
		

	}

}
