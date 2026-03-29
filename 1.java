class student {
    String name; // variable
    int age ;  //variable

    public void getInfo () {
        System.out.println("the name of student name: "+this.name);
        System.out.println("the name of student age: "+this.age);

        }
    }

public class oops {
    public static void main(String[]args) {
        student s1 = new student();
        s1.name = "madhuri";
        s1.age = 24;
        s1.getInfo(); 

        }
    }
