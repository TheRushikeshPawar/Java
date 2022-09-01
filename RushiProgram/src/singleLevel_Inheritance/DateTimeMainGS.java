package singleLevel_Inheritance;

public class DateTimeMainGS {

	public static void main(String[] args) {	
		
      DateGS d=new DateGS();
      d.setDate(16);
      d.setMonth(8);
      d.setYear(2022);
      
      TimeGS t=new TimeGS();
      t.setHours(16);
      t.setMinit(12);
      t.setSecond(52);
      
      System.out.println(d.getDate()+"/"+d.getMonth()+"/"+d.getYear()+" : "+t.getHours()+":"+t.getMinit()+":"+t.getSecond());
      
      
   

	}

}
