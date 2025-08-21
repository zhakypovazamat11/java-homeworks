package homework5.task6;

public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant orchid = new Orchid();
    Plant cactus = new Cactus();
    //garden.addPlant(orchid);
    garden.addPlant(cactus);
    garden.care();
  }
}
