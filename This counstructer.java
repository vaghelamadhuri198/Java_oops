class Thisdemo {
	Thisdemo() {
		this(10);
		System.out.println("default counstructer");
	}
	Thisdemo(int a) {
		//this();
		System.out.println("parameterize counstructer");
	}

	public static void main(String[] args) {
		Thisdemo t1 = new Thisdemo();
	}
}
