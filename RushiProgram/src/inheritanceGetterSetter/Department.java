package inheritanceGetterSetter;

 public class Department {
		int id,NoStudent;
		String name,hod;
		Student s;


		public void setId(int id) {
			this.id=id;
		}

		public int getId() {
			return id;
		}

		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setNoStudent(int NoStudent) 
		{
			this.NoStudent=NoStudent;
		}
		public int getNoStudent()
		{
			return NoStudent;
		}
		public void setHod(String hod) {
			this.hod = hod;
		}

		public String getHod() {
			return hod;
		}
		public void setS(Student s) {
			this.s=s;
		}
		public Student getS() {
			return s;
		}

		}

