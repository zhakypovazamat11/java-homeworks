package practice3;

public class Main {

  public static void main(String[] args) {
    //создали переменную > присвоили переменной экземплят класса студент
    // вызвав дефолтный конструктор
    System.out.println(Student.studentCount);
    Student petya = new Student("Petya", 19);
    System.out.println(Student.studentCount);
    Student kolya = new Student("Kolya", 18);
    System.out.println(Student.studentCount);
//    System.out.println(petya.age);
//    System.out.println(kolya.age);
    System.out.println(Student.MAX_YEARS);
    Student.printMaxYear();
  }
}
