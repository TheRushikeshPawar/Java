package stringinJava;

public class StringMethods {

	public static void main(String[] args) {
	
		String s1="java";
		String s2="Language";
		String s3="java";
		String s4="Java";
		String s5=new String("Java");
		
		System.out.println(s1==s5);     //Checking Memory Location
		
		System.out.println("eaquals : "+s1.equalsIgnoreCase(s3));    //checking Contains in both string 
		
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		
		System.out.println("Compare To : "+s4.compareTo(s1));
		
		//s1>s3   +ve  s1-s3
		//s1<s3   -ve   s1-s3
		// s1==s3   0    s1-s3
		
		System.out.println("CompareTo Ignore Case : "+s1.compareToIgnoreCase(s3));
		                                                         //01234567
		System.out.println("Index Of : "+s2.indexOf('a'));       //Language
		
		System.out.println("Last Index Of : "+s2.lastIndexOf('a'));
		
		System.out.println("Contains : "+s2.contains("gu"));
		
		System.out.println("Replace : "+s2.replace('a', 'A')+" "+s2.replace("age","AGE"));
		
		System.out.println("Search From Index : "+s2.indexOf('a', 3));
		
		System.out.println("Substring : "+s2.substring(3));       //Language
		
		System.out.println("Substring 2 inputs : "+s2.substring(2, 6));
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println("Charat :"+s2.charAt(4));
		
		System.out.println();

	}

}
