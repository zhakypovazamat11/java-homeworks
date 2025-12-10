package clean_code.homework2.task1;

public class Main {

  public static void main(String[] args) {
    ConfigurationManager configurationManager = ConfigurationManager.getInstance();
    configurationManager.loadConfig("localhost:5432", "azhakypov", "test1234!@#");
    configurationManager.setFilePath("/e/src/image/testData");
    configurationManager.setLogSettings("INFO", "/src/logFiles/staging1");
  }

}
