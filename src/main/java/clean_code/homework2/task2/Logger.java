package clean_code.homework2.task2;

public class Logger {

  private static Logger logger;
  private String event = "Успешное подключение к базе";
  private String exceptionMessage = "Исключение при выполнении операции";
  private String warning = "Устаревший метод";

  private Logger() {

  }

  public static synchronized Logger getInstance() {
    if (logger == null) {
      logger = new Logger();
    }

    return logger;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public String getExceptionMessage() {
    return exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }
}
