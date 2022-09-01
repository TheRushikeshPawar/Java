package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimunCharachter {
	
	public void minCharachter(char arr[])
	{
      char min='a';
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]<min)
    	  {
    		  min=arr[i];
    	  }
    	  
      }
      System.out.println("Minimun Charachet is :"+min);
      System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		char arr[] = {'A','D','E','x','z','R'};
		MinimunCharachter m=new MinimunCharachter();
		m.minCharachter(arr);
	
		
		

	}

}
