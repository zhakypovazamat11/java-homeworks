package homework5.task6;

public class Garden {

  private Plant plant;

  public void addPlant(Plant plant) {
    this.plant = plant;
    System.out.println("Растение добавлено");
  }

  public void care() {
    this.plant.care();
  }
}
