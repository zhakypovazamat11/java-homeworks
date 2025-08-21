package homework5.task5;

public class Farm {

  private Animal animal;

  public void setAnimal(Animal animal) {
    this.animal = animal;
  }

  public void careAnimal() {
    this.animal.care();
  }

  public void produce() {
    this.animal.produce();
  }
}
