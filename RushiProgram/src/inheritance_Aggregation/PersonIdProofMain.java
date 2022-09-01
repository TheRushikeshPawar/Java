package inheritance_Aggregation;

public class PersonIdProofMain {

	public static void main(String[] args) {
		
		Id_Proof id=new Id_Proof("Aadhar Card","9416 0171 9408",2050);

		Person1 p=new Person1(101,"Rushikesh","9764245590","Pune",id);
		
		System.out.println(p);
	}

}
