package homework7.generic_tasks;

public class Main {

  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.setVolume("Объем данной коробки равен: 3.0");
    //box.setVolume(321312);
    System.out.println("Коробка с типом String " + box.getVolume());

    Box<Integer> box1 = new Box<>();
    box1.setVolume(3);
    System.out.println("Коробка с типом Integer: " + box1.getVolume());

    Integer[] array = {1, 2, 3};
    printArray(array);

    Pair<Integer, String> pair = new Pair<>();
    pair.setItemOfObjectT(1);
    pair.setItemOfObjectV("Azamat");
    System.out.println("Объект по типу T: " + pair.getItemOfObjectT() + " Объект по типу V: "
        + pair.getItemOfObjectV());
  }

  //Напишите дженерик метод printArray, который принимает массив элементов любого типа
  // и выводит каждый элемент массива на консоль
  public static <T> void printArray(T[] array) {
    for (T element : array) {
      System.out.println(element);
    }
  }
}
