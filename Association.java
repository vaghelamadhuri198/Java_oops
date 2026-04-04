class College {
	String name ;
	int roll_no;

	void show() {
		System.out.println("name:" + name);
		System.out.println("roll_no:" + roll_no);
	}
}

class Info {
	String name ;
	int roll_no;

	void display() {
		System.out.println(name);
		System.out.println(roll_no);
	}
	public static void main(String[]args) {
		//College c1 = new College();
		//c1.name = "madhuri";
		//c1.roll_no = 29;
		//c1.show();
		//c1.show();

		Info c1 = new Info();
		c1.name = "madhuri";
		c1.roll_no = 29;
		c1.display();
	}
}



