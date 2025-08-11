package practice2;

public class Student {

  int age;
  String name;

  Student(int someAge, String someName) {
    this.age = someAge;
    this.name = someName;
  }

  int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  void print() {
    System.out.println("Возраст " + this.age + ", имя " + this.name);
  }
}
