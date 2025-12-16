package clean_code.homework2.task1;

public class ConfigurationManager {

  private static ConfigurationManager configurationManager;
  private DbConfig dbConfig;
  private String filePath;
  private LogSettings logSettings;

  private ConfigurationManager() {
  }

  public static synchronized ConfigurationManager getInstance() {
    if (configurationManager == null) {
      configurationManager = new ConfigurationManager();
    }
    System.out.println("Configuration manager created");
    return configurationManager;
  }

  public void loadConfig(String dbUrl, String userName, String password) {
    dbConfig = new DbConfig(dbUrl, userName, password);
    System.out.println("Dbconfig loaded, url: " + dbUrl + " user: " + userName);
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
    System.out.println("new file path set to " + filePath);
  }

  public void setLogSettings(String loggingLevel, String logFilePath) {
    logSettings = new LogSettings(loggingLevel, logFilePath);
    System.out.println("logging level set to " + loggingLevel + " logFilePath " + logFilePath);
  }
}
