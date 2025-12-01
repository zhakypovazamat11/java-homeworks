package clean_code.practice2.creational.singleton.before;

public class Main {

  public static void main(String[] args) {
    DatabaseConfig config1 = new DatabaseConfig();
    DatabaseConfig config2 = new DatabaseConfig();

    config1.config = "DB Config for User A";
    config2.config = "DB Config for User B";

    config1.displayConfig(); // Выводит "DB Config for User A"
    config2.displayConfig(); // Выводит "DB Config for User B"
  }
}