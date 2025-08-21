package homework5.task1;

public class Zoo {

  private Animal animal;

  public void add(Animal animal) {
    System.out.println("Животное " + animal + " добавлено в Зоопарк");
    this.animal = animal;
  }

  public void forceMakeSound() {
    this.animal.makeSound();
  }

  public void forceMakeMove() {
    this.animal.move();
  }
}
