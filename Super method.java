class A {
	void display() {
		System.out.println("i am madhuri");
	}
}
class B extends A {
	void show() {
		super.display();
	}
	public static void main(String[]args) {
		B a1 = new B();
		a1.show();
	}
}
