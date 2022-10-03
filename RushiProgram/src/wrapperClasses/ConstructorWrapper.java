package wrapperClasses;

public class ConstructorWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// float-3 character-1
		
		Integer i=new Integer(30);    //Number
		Integer i1=new Integer("60"); //String
		
		Character ch=new Character('d');
		
		Float f1=new Float(4.5);    //float
		Float f2=new Float("4.5");  //String
		Float f3=new Float (4.5);   // double
		
		
		String s="90";              //parsing method
		
		int a=Integer.parseInt(s);
		float f=Float.parseFloat(s);
		double d=Double.parseDouble(s);
		
		
		
		  Integer h1=Integer.valueOf(40); 
		  Integer h2=Integer.valueOf("70");
		  
		  Integer h3=Integer.valueOf("1011",2);   
		                                     //1*2^3 + 0*2^2 + 1*2^1+ 1*2^0 =11
		                                     //Number of Digits 4 
		                                     // 1 0 1 1 
		                                     // 3 2 1 0 index start from
		  
		  System.out.println(h3); 
		  Integer h4=Integer.valueOf("10101", 4);
		  System.out.println(h4);
		  
		  Integer h5=Integer.valueOf("123405", 6); 
		  System.out.println(h5);
		  
		  Integer h6=Integer.valueOf("01234567", 8); 
		  System.out.println(h6);
		 
	}

}
