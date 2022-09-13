package stringinJava;

public class OcceranceOfEachCharachter {

	public static void main(String[] args) {
		
		String s="Java is a programming language";
		
		int cnt=0;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			 cnt=1;
			char c=ch[i];
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]==c)
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0')
			{
				System.out.println(c + " "+cnt);
			}
		}

	}

}
