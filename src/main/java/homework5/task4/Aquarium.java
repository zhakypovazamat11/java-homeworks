package homework5.task4;

public class Aquarium {

  private SeaCreature creature;

  public void addCreature(SeaCreature creature) {
    System.out.println("Существо добавлено");
    this.creature = creature;
  }

  public void showMovement() {
    this.creature.move();
  }
}
