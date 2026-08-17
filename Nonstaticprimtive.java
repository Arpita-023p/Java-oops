public class Nonstaticprimtive {
 public void displaydetils(int age,double salary){
   System.out.println("age is "+age);
   System.out.println("Salary is "+salary);
 }
 public static void main(String[] args) {
    Nonstaticprimtive obj=new Nonstaticprimtive();
    obj.displaydetils(10, 50000);
 }
}



