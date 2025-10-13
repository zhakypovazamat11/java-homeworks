package homework8.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {
    MathOperation addition = (a, b) -> a + b;
    MathOperation substraction = (a, b) -> a - b;
    MathOperation multiplication = (a, b) -> a * b;
    MathOperation division = (a, b) -> {
      if (b == 0) {
        throw new ArithmeticException("Ошибка при делении на ноль!!!");
      } else {
        return a / b;
      }
    };
    System.out.println("Задача 1: Создайте свой функциональный интерфейс");
    System.out.println("12 + 432 = " + addition.calculate(12, 432));
    System.out.println("432432 - 432 = " + substraction.calculate(432432, 432));
    System.out.println("11 * 15 = " + multiplication.calculate(11, 15));
    System.out.println("32 / 8 = " + division.calculate(32, 8));
    //System.out.println(division.calculate(32, 0));

    System.out.println("Задача 2: Использование анонимного класса");
    Runnable r1 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello from anonymous class!");
      }
    };
    r1.run();

    System.out.println("Задача 3: Лямбда-выражение с Predicate");
    Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
    System.out.println("Вызов isEvenNumber c числом 6: " + isEvenNumber.test(6));
    System.out.println("Вызов isEvenNumber c числом 5: " + isEvenNumber.test(5));

    System.out.println("Задача 4: Лямбда-выражение с Function");
    Function<String, Integer> calculateStrLength = String::length;
    System.out.println("Кол-во символов в имени Азамат " + calculateStrLength.apply("Азамат"));

    System.out.println("Задача 5: Использование Consumer");
    Consumer<String> print = System.out::println;
    print.accept("Hello world!!!");
  }

}
