package inheritance_Aggregation;

public class DepartmentStudentMain {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Vijay",85);
		Student s2=new Student(102,"Rajesh",73);
		Student s3=new Student(103,"Akshay",83);
		Student s4=new Student(104,"Arun",78);
		Student s5=new Student(105,"Vishakha",81);
		
		Department d1=new Department(1,25,"Physics","Vishal Sir",s1);
		Department d2=new Department(2,22,"Math","Arjun Sir",s2);
		Department d3=new Department(3,28,"Electronics","Arti Mam",s3);
		Department d4=new Department(4,26,"Chemistry","Samir Sir",s4);
		Department d5=new Department(5,21,"Statistics","Vinod Sir",s5);
		
		System.out.println(d1);
		System.out.println();
		System.out.println(d2);
		System.out.println();
		System.out.println(d3);
		System.out.println();
		System.out.println(d4);
		System.out.println();
		System.out.println(d5);

	}

}
