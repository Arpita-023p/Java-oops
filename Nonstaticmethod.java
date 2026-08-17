public class Nonstaticmethod {
    public static void main(String[] args) {
        Nonstaticmethod n1=new Nonstaticmethod();
        n1.m1();
    }
    public void m1(){
    System.out.println("calling a non static method");
    }
}
