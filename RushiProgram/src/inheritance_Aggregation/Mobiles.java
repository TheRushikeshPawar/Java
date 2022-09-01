package inheritance_Aggregation;

public class Mobiles {
	
   int id,price;
   String name;
   Battery b;
   
  Mobiles(int id,int price,String name,Battery b)
  {
	  this.id=id;
	  this.price=price;
	  this.name=name;
	  this.b=b;
  }
  public String toString()
  {
	  return id+" "+price+" "+name+" :"+b;
  }
}
