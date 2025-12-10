package clean_code.homework2.task2;

public class Main {

  public static void main(String[] args) {
    Logger logger = Logger.getInstance();
    System.out.println(logger.getEvent());
    System.out.println(logger.getExceptionMessage());
    System.out.println(logger.getWarning());

    Logger logger1 = Logger.getInstance();
    logger1.setEvent("Создание аппликации");
    System.out.println(logger1.getEvent());
    System.out.println(logger.getEvent());
  }

}
