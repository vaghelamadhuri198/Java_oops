class Student {
        String name;
        int roll_no;
        int age;

        void display() {
                System.out.println(name);
                System.out.println(roll_no);
                System.out.println(age);
        }
}

class oops {
        public static void main(String[]args) {
                Student s1 = new Student();
                s1.name = "madhuri";
                s1.roll_no = 89;
                s1.age = 30;
                s1.display();
        }
}
