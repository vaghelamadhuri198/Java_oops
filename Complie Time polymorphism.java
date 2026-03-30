class MathExample {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathExample obj = new MathExample();

        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
        System.out.println(obj.add(5.5, 2.5));
    }
}
