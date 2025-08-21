package practice5.task2;

public class Main {

  public static void main(String[] args) {
    Item muq = new Item("Кружка", 220.49, 2);
    Item mic = new Electronic("Микрофон", 10000, 1);
    Item dress = new Clothes("Платье", 8000, 3);
    Manager kostya = new Manager();
    kostya.manage(muq);
    kostya.manage(mic);
    kostya.manage(dress);
  }

}
