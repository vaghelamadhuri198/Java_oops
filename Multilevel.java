class A {
    void display() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void show() {
        System.out.println("This is class B");
    }
}

class C extends B {
    void print() {
        System.out.println("This is class C");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();

        obj.display();
        obj.show();
        obj.print();
    }
}
