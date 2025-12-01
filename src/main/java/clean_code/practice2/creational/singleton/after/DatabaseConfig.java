package clean_code.practice2.creational.singleton.after;

public class DatabaseConfig {

  // единственный экземпляр конфиг
  private static DatabaseConfig databaseConfig;
  //Трансформировать конфиг в единственный экземпляр с помощью паттерна одиночка
  public String config = "Default Config";

  //Закрыли возможность вызывать конструктор
  private DatabaseConfig() {
  }

  //Создание единственного экземпляра
  public static DatabaseConfig getInstance() {
    if (databaseConfig == null) {
      databaseConfig = new DatabaseConfig();
    }
    return databaseConfig;
  }

  public void displayConfig() {
    System.out.println(config);
  }
}
