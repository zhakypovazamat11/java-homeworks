package practice3;

public class Student {

  final static int MAX_YEARS = 11;
  static int studentCount;

  static {
    studentCount = 0;
  }

  private int age;
  private String name;

  Student(String name, int age) {
    this.age = age;
    this.name = name;
    studentCount++;
  }

  static void printMaxYear() {
    System.out.println(MAX_YEARS);
  }
}
