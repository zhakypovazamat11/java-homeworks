package homework3;

public class Main {

  public static void main(String[] args) {
    Company employee1 = new Company(1, "Petr");
    Company employee2 = new Company(2, "Kirill");
    Company employee3 = new Company(3, "Oleg");
    Company.companyName = "SF Building";
    Company.printCompanyName();
    //employee1.employeeID = 5;
    System.out.println(MathConstants.calculateCircleArea(5));
    System.out.println(MathConstants.calculateCircleArea(10));
    System.out.println(MathConstants.calculateCircumference(5));
    System.out.println(MathConstants.calculateCircumference(10));
    University student1 = new University(1, "Kirill");
    University student2 = new University(2, "Petr");
    University student3 = new University(3, "Ivan");
    University.changeUniversityName("KRSU");
    student1.printStudentInfo();
    student2.printStudentInfo();
    student3.printStudentInfo();

    GameSettings game1 = new GameSettings("Fifa 25");
    GameSettings game2 = new GameSettings("UFC 5");
    GameSettings.setMaxPlayers(4);
    game1.addPlayer();
    game1.addPlayer();
    game1.addPlayer();
    game1.addPlayer();
    game1.printGameStatus();
    game1.addPlayer();
    game1.printGameStatus();
    game2.printGameStatus();
    game2.addPlayer();
    game2.addPlayer();
    game2.printGameStatus();

    Person p1 = new Person("1234-56", "Ivan", "Ivanov");
    Person p2 = new Person("1234-57", "Petr", "Petrov");
    Person p3 = new Person("1234-58", "Kirill", "Kirillov");
    p2.setFirstName("Oleg");
    p2.printPersonInfo();
    p1.printPersonInfo();
  }

}
