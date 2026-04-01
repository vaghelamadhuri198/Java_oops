class test {
	void show() {
		System.out.println("i am student");
	}
	static void print() {
		System.out.println("i am not student");
	}
	public static void main(String[]args) {
		test t = new test();
		t.show();
		t.display();
		t.print();
	}
	static void display() {
		System.out.println("i am fresher");
	}
}
