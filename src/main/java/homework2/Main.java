package homework2;

public class Main {

  public static void main(String[] args) {
    Car car1 = new Car("BMW", 2018);
    car1.setYear(2019);
    car1.print();

    Rectangle rectangle = new Rectangle(5, 7);
    rectangle.setWidth(3);
    System.out.println("Calculated area: " + rectangle.calculateArea());

    Book book1 = new Book("Java", "Schildt");
    book1.setAuthor("Herbert Schildt");
    book1.printInfo();

    BankAccount client1 = new BankAccount("Azamat", 10_000);
    client1.deposit(3500);
    client1.withdraw(100);
    client1.printBalance();

    Point point1 = new Point(0, 0);
    point1.setX(-10);
    point1.print();

    StudentGroup itc1_15 = new StudentGroup("ITC1-15", 24);
    itc1_15.setStudentCount(26);
    itc1_15.printInfo();

    Circle circle1 = new Circle(3.2);
    circle1.setRadius(4.4);
    System.out.println(
        "Area: " + circle1.calculateArea() + " Circumference: " + circle1.calculateCircumference());

    Teacher teacher = new Teacher("Alex", "Math");
    teacher.setSubject("Computer Science");
    teacher.printInfo();

    Product apple = new Product("Apple", 3.62);
    apple.setPrice(10);
    apple.applyDiscount(20);
    apple.printInfo();

    Laptop hp = new Laptop("HP", 1500);
    hp.printInfo();
  }
}
