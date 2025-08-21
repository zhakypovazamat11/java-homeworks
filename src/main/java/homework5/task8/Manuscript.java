package homework5.task8;

public class Manuscript extends Exhibit {

  @Override
  void info() {
    System.out.println("Манускрипт");
  }

  @Override
  void preserve() {
    System.out.println("Манускрипт — требует контролируемой влажности");
  }
}
