package For_loop;
import java.util.Scanner;
public class Even_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int limit=sc.nextInt();
		int i,sum=0;
		
		for(i=1;i<=limit;i++)
		{
			if(i%2==0)
			System.out.println(i);
		
		}
		System.out.println("Done");
	}

}
