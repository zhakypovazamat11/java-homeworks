package homework5.task7;

public class RollerCoaster extends Attraction implements Extreme {

  @Override
  public void maintain() {
    System.out.println("Американские горки требуют регулярной проверки безопасности");
  }

  @Override
  public void info() {
    System.out.println("Американские горки острые ощущения");
  }
}
