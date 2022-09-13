package stringBufferAndBuilder;

public class StringBufferExample {

	public static void main(String[] args) {
		
		String s=new String("Java");
		s.concat("Core");
		System.out.println(s);
		
		StringBuffer sbf=new StringBuffer("Java");   //16+4
		sbf.append("Core");
		System.out.println(sbf);
		
		System.out.println(sbf.capacity());        // Capacity Character sb can hold
		System.out.println(sbf.length());          // length of string
		
		
		sbf.append("Language is a Good Language");
		System.out.println(sbf);

	//	System.out.println(sbf.capacity());
		
	//	System.out.println(sbf.length());
		
	//	System.out.println(sbf.reverse());
		                                                  //01234567
	//	System.out.println(sbf.replace(3, 6, "Rushi"));   //JavaCore
		
		sbf.deleteCharAt(3);               //only of which charachter do you want delet
		System.out.println(sbf);
		
		sbf.delete(2, 5);                  // delete from to character do you want
		System.out.println(sbf);
	}

}
