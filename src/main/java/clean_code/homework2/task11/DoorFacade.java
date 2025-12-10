package clean_code.homework2.task11;

public class DoorFacade {

  private static DoorFacade doorFacade;
  private DoorOpen doorOpen;
  private DoorClose doorClose;
  private DoorLock doorLock;

  private DoorFacade() {
    doorOpen = new DoorOpen();
    doorClose = new DoorClose();
    doorLock = new DoorLock();
  }

  public static DoorFacade getInstanceDoorFacade() {
    if (doorFacade == null) {
      doorFacade = new DoorFacade();
    }

    return doorFacade;
  }

  public void openDoor() {
    doorLock.unlockDoor();
    doorOpen.openDoor();
  }

  public void closeAndLockDoor() {
    doorClose.closeDoor();
    doorLock.lockDoor();
  }


}
