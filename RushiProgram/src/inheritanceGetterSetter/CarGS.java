package inheritanceGetterSetter;

public class CarGS {
	
	private int id;
	private String name,cnumber;
	DriverGS d;
	
		public void setId(int id)
		{
			this.id=id;
	    }
		public void setName(String name)
		{
			this.name=name;
		}
		public void setCnumber(String cnumber)
		{
			this.cnumber=cnumber;
		}
		
		public int getId()
		{
			return id;
		}
		
		public String getName()
		{
			return name;
		}
		public String getCnumber()
		{
			return cnumber;
		}
		
		
		public void setD(DriverGS d)
		{
			this.d =d;
		}
		
   public DriverGS getD()
   {
	   return d;
   }
}
