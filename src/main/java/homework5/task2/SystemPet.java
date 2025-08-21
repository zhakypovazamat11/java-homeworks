package homework5.task2;

public class SystemPet {

  private Pet pet;

  SystemPet(Pet pet) {
    this.pet = pet;
  }

  public void feedPet() {
    this.pet.eat();
  }

  public void forcePetToPlay() {
    if (this.pet instanceof Playable) {
      Playable playablePet = (Playable) this.pet;
      playablePet.play();
    } else {
      System.out.println("Ошибка: Животное не играет");
    }
  }

  public void forcePetToWalk() {
    if (this.pet instanceof Walkable) {
      Walkable walkablePet = (Walkable) this.pet;
      walkablePet.walk();
    } else {
      System.out.println("Ошибка: Животное не гуляет");
    }
  }
}
