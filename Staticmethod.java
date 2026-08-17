public class Staticmethod {
    public static void main(String[] args) {
        Staticmethod.m1();// by class name it is recommend
        // new Staticmethod.m1(); by obeject
        m1();// directly
    }

    public static void m1() {
        System.out.println("Static method");
    }
}