class Student {
        String name;
        int age;
        float marks;

        Student(String n , int a , float m) {
                name = n;
                age = a;
                marks = m;
        }

        void display() {
                System.out.println(name);
                System.out.println(age);
                System.out.println(marks);

        }
}
public class oops {
        public static void main(String[] args) {
                Student s1 = new Student("madhuri",78,100);
                //s1.name = "madhuri";
                //s1.age = 29;
                //s1.marks = 100;
                s1.display();
        }
}
