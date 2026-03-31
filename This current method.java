class student {
	void display() {
		System.out.println("hello");
	}
	void show() {
		//display(); //default this keyword
		this.display();
	}
	public static void main(String[] args) {
		student s1 = new student();
		s1.show();
	}
}
