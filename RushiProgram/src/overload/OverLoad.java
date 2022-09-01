package overload;

import java.util.Scanner;

public class OverLoad {         // OverLoad 
	
	public void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
	
	public void compare(char c1, char c2) {
	    
        if (c1 > c2) {
            System.out.println(c1);
        }
        else {
            System.out.println(c2);
        }
        
    }

	public static void main(String[] args) {

          Scanner sc=new Scanner(System.in); 
          OverLoad obj=new OverLoad();
          System.out.print("Enter first Integer : ");
         int a=sc.nextInt();
          System.out.print("Enter second Integer: ");
          int b=sc.nextInt();
          sc.nextLine();
          obj.compare(a, b);
          
          
          System.out.print("Enter first character: ");
          char c1 = sc.next().charAt(0);
          System.out.print("Enter second character: ");
          char c2 = sc.next().charAt(0);
          sc.nextLine();
          obj.compare(c1, c2);

	}

}
