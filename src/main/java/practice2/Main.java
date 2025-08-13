package practice2;

import practice3.Test1;

public class Main {

  public static void main(String[] args) {
    Student petya = new Student(18, "Petya");
    petya.print();
    Student kolya = new Student(20, "Kolya");
    kolya.print();
    petya.setName("Petr");
    petya.print();
    kolya.setAge(25);
    kolya.print();

    Test1 test1 = new Test1();
  }
}
