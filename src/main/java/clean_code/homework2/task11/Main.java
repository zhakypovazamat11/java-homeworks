package clean_code.homework2.task11;

public class Main {

  public static void main(String[] args) {
    DoorFacade doorFacade = DoorFacade.getInstanceDoorFacade();
    doorFacade.openDoor();
    doorFacade.closeAndLockDoor();
  }

}
