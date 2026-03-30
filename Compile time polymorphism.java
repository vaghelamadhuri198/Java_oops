class MathExample {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void  add(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MathExample obj = new MathExample();
		obj.add(10, 20);
		obj.add(10, 20, 40);
		obj.add(10, 20);


		//System.out.println(obj.add(5, 10));
		//System.out.println(obj.add(5, 10, 15));
		//System.out.println(obj.add(5.5, 2.5));
	}
}
