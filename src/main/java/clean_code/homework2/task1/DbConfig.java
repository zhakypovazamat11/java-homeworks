package clean_code.homework2.task1;

public class DbConfig {

  private String dbUrl;
  private String userName;
  private String password;

  public DbConfig(String dbUrl, String userName, String password) {
    this.dbUrl = dbUrl;
    this.userName = userName;
    this.password = password;
  }

}
