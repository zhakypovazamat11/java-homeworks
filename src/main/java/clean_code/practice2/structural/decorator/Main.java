package clean_code.practice2.structural.decorator;

public class Main {

  public static void main(String[] args) {
    Coffee simpleCoffee = new SimpleCoffee();
    simpleCoffee = new MilkDecorator(simpleCoffee);
    System.out.println(simpleCoffee.cost());

    Coffee coffeeWithSugar = new SimpleCoffee();
    coffeeWithSugar = new SugarDecorator(coffeeWithSugar);
    System.out.println(coffeeWithSugar.cost());

    Coffee coffeeWithSugarAndMilk = new SimpleCoffee();
    coffeeWithSugarAndMilk = new SugarDecorator(coffeeWithSugarAndMilk);
    coffeeWithSugarAndMilk = new MilkDecorator(coffeeWithSugarAndMilk);
    System.out.println(coffeeWithSugarAndMilk.cost());

        /*
        Если завтра мы начнем расширение коффейни и у нас добавится 100 топпингов:

        Создать классы для всех возможных комбинций топинга между собой:

        Пример: у нас есть сироп с миндалем, карамелью и шоколадом

        кофе с минадлем
        кофе с миндалем и карамелью
        кофе с миндалем и шоколадом
        кофе с миндалем карамелью и шоколадом

        количество комбинаторных комбинаций будет расти расти и расти
         */
  }
}
