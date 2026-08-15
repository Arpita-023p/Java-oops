public class Instance {
    int x=10;
    {
        m1();
        System.out.println("first instance block");
    }
    Instance()
    {
      System.out.println("constructor");
    }
    public static void main(String[] args) {
        new Instance();
        System.out.println("main method");
    }
    public void m1(){
        System.out.println(y);
    }
    {
System.out.println("Second instance block");
    }
    int y=20;
}
