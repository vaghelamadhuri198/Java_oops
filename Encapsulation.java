class Student {
    private String name;   // private variable

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Meera");        // setting value
        System.out.println(s.getName());  // getting value
    }
}
