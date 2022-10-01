package stringWrittenQue;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		
      String str = "HELLO$WORLD";
      
      String arr[]=str.split("\\$");
      System.out.println(arr.length);
      
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]);
      }
      
	}

}
