package practice7.photo_editor;

public class Main {

  public static void main(String[] args) {
    PhotoEditor ph = new PhotoEditor();
    ph.addNewAction("Корректировка глаз");
    ph.addNewAction("Корректировка ушей");
    ph.addNewAction("Корректировка тела");
    ph.addNewAction("Корректировка носа");
    ph.printActions();
    ph.undoLastAction();
    ph.printActions();
  }

}
