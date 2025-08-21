package homework5.task2;

public class Main {

  public static void main(String[] args) {
    Cat cat = new Cat();
    SystemPet petSystem = new SystemPet(cat);
    petSystem.feedPet();
    petSystem.forcePetToPlay();
    petSystem.forcePetToWalk();


  }

}
