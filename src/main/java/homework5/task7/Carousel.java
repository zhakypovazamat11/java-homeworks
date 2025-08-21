package homework5.task7;

public class Carousel extends Attraction implements Moderate {

  @Override
  public void maintain() {
    System.out.println("Карусель требует частое техническое обслуживание");
  }

  @Override
  public void info() {
    System.out.println("Карусель - спокойный аттракцион");
  }
}
