package clean_code.practice2.creational.builder;

public class Main {

  public static void main(String[] args) {
    Pizza pizza = new Pizza("thick", "tomato", "pepperoni");

    // Правила синтаксиса Java при создании объектов:
    // строгий порядок параметров метода (конструктора)
    // запрет на пропуск параметра

    // Pizza pizza = new Pizza("tomato", "pepperoni");
    Pizza flexiblePizza = new Pizza.Builder().setSauce("tomato").setTopping("pepperoni").build();
    System.out.println(pizza);
    System.out.println(flexiblePizza);
  }
}
