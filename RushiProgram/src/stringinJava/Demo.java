package stringinJava;

public class Demo {
	
	static void charachter(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='A';
			}
		}
		String s1=new String(ch);
		System.out.println(s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java is a programming ";
		
		charachter(s);

	}

}
