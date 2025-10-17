package practice12.mistake;

import java.util.ArrayList;
import java.util.List;

/**
 * Программа предназначенная для хранения и обработки списка строк. Она должна добавлять строки в
 * список, если они еще не присутствуют в нем, и выводить финальный размер списка. Однако в конечном
 * списке появляются дубликаты.
 */

public class StringListHandler {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    String[] inputs = {"apple", "banana", "apple", "Orange", "Banana", "Grape", "Orange"};

    for (String input : inputs) {
      if (input.equals("Orange")) {
        int j = 0;
      }
      if (!list.contains(input.toLowerCase())) {
        list.add(input.toLowerCase());
      }
    }
    System.out.println("Размер списка: " + list.size());
    System.out.println("Содержимое списка: " + list);
  }

}
