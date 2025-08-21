package homework5.task3;

public class HotDish extends Dish {

  private final static int DEFAULT_TEMPERATURE = 60;
  private int temperature;

  HotDish() {
    this.temperature = DEFAULT_TEMPERATURE;
  }

  @Override
  void getDescription() {
    System.out.println(
        "Горячее блюдо — с температурой: " + this.temperature + "(градусов по Цельсия)");
  }
  
}
