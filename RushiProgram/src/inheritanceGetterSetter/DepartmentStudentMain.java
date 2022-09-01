package inheritanceGetterSetter;

public class DepartmentStudentMain {

		public static void main(String[] args) {
			
			Student s=new Student();
			s.setId(101);
			s.setName("Ajay");
			s.setMarks(85);

			
			Department d=new Department();
			d.setId(101);
			d.setName("Ajay");
			d.setNoStudent(25);;
			d.setHod("Vishal Sir");
			d.setS(s);
			
			System.out.println(d.getName()+" "+d.getNoStudent()+" "+d.getHod()+" "+d.s.getName()+" "+d.s.getMarks());



	}

}
