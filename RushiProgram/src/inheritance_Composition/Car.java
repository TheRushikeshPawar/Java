package inheritance_Composition;

import inheritance_Aggregation.Driver;

public class Car {
		
		int id;
		String name,cnumber;
		Driver d;
		
		Car(int id,String name,String cnumber)
		{
			this.id=id;
			this.name=name;
			this.cnumber=cnumber;
		//	this.d=new Driver(1,"Ajay","9764557834");
		}
		
		public String toString()
		{
			return id+" "+name+" "+cnumber+" : "+d;
		}

	}

