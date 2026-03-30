class Student {
	String name;
	int age ;
	double marks ;


	//Student() {
		//name = "madhuri";
		//age = 69;
		//marks = 90.0 ;

	//}

	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}
}

class oops {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name ="madhuri";
		s1.age = 29;
		s1.marks = 500;
		s1.display();

	}
}
