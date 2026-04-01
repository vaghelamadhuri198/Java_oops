class A {
	int i = 30;
	void display() {
		System.out.println(i);
	}
}
class B extends A {
	int i = 20;
	void show(int i) {
		//System.out.println(i); //10
		//System.out.println(this.i); //20
		System.out.println(super.i); //30
	}
	public static void main(String[]args) {
		B a1 = new B();
		a1.show(10);
	}
}
