package homework6.treemap_tasks;

public class Main {

  public static void main(String[] args) {
    TreeMapTask employee = new TreeMapTask();
    employee.addEmployee(1, "Azamat");
    employee.addEmployee(150, "Oleg");
    employee.addEmployee(323, "Ivan");
    employee.addEmployee(200, "Petr");
    employee.searchNextGreaterId(205);

  }

}
