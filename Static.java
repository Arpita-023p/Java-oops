class Static{
    static int x=10;
    static{
        m1();
        System.out.println("First static block");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }
    public static void m1(){
        System.out.println(y);
    }
    static
    {
        System.out.println("Second static block");
    }
    static int y=20;
}