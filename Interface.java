interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {
    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}
