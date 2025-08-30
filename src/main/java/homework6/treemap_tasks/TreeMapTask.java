package homework6.treemap_tasks;

import java.util.TreeMap;

public class TreeMapTask {

  private TreeMap<Integer, String> employees;

  public TreeMapTask() {
    employees = new TreeMap<>();
  }

  public void addEmployee(int id, String name) {
    employees.put(id, name);
  }

  public void searchNextGreaterId(int id) {
    Integer nextId = employees.higherKey(id);
    if (nextId == null) {
      System.out.println("Нет более высокого ID");
    } else {
      System.out.println("ближайший больший ID " + nextId);
    }
  }
}
