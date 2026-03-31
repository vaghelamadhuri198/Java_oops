class student {
	int i;  //intranst variable
	//void setvalue(int x) {  //local variable
	void setvalue(int i) {  //local variable
		//i = x;  // 10 print
		//i = i;  //0
		this.i = i; //10 print
	}
	void display() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		student s1 = new student();
		s1.setvalue(10);
		s1.display();
	}
}
