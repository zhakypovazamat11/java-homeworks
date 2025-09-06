package lectures_practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Person nikita = new Person("Никита", 25);
    //Значение toString() по умолчанию;
    System.out.println(nikita.toString());

    // Cравнение объектов (примитивные типы через ==)
    // а ссылочные сравниваются через equals
    Person nikita2 = new Person("Никита", 25);
    System.out.println(nikita == nikita2);
    System.out.println(nikita.equals(nikita2));
    // Клонирование
    Person cloneNikita = nikita.clone();
    System.out.println(cloneNikita.toString());

    List<String> list = new ArrayList<>();
    list.add(null);
    list.add("Java");
    list.add(null);

    System.out.println(list.contains(null));
    System.out.println(list.indexOf(null));
    System.out.println(list.lastIndexOf(null));


  }

}
