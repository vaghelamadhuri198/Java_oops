class Address {
	String city = "rajkot";
}

class Student {
	String Address = "shivam socity";
	Address addr = new Address();   // association

	void display() {
		System.out.println(Address);
		System.out.println(addr.city);
	}
}

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}
}
