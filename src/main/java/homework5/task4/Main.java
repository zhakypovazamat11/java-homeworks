package homework5.task4;

public class Main {

  public static void main(String[] args) {
    Aquarium aqua = new Aquarium();
    SeaCreature shark = new Shark();
    aqua.addCreature(shark);
    aqua.showMovement();
  }

}
