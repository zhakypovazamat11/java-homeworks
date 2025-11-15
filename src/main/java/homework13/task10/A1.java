package homework13.task10;

public class A1 {

  public static void print() {
    System.out.println("Static");
  }

  public static void main(String[] args) {
    A1 a = null;
    a.print();
    //A1 b;
    //b.print();
    A1 c = new A1();
    c.print();
  }

}
