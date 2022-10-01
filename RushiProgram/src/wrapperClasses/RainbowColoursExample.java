package wrapperClasses;

import java.util.Arrays;

public class RainbowColoursExample {

	public static void main(String[] args) {
		
		RainbowColors rc1= RainbowColors.GREEN;
		RainbowColors rc2=RainbowColors.VIOLET;
		
	 // System.out.println(rc1.ordinal());   // Ordinal = Location of the Colour
		
		RainbowColors rc[]=RainbowColors.values();
		
      // System.out.println(Arrays.toString(rc));    //or
		
		for(RainbowColors rlc:rc)
		{
			System.out.println(rlc.ordinal()+" "+rlc);
		}
		
	}

}
