package homework7.exception_tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    // Задача 1
    FileReader file = null;
    try {
      file = new FileReader("data.txt");
      System.out.println("Файл открыт!");
    } catch (FileNotFoundException e) {
      System.err.println("Файл не найден");
    } finally {
      if (file != null) {
        try {
          file.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
        System.out.println("Файл закрыт");
      }
    }
    // задача 2
    divide(15, 0);
    //задача 3
    try {
      checkUserAge(151);
    } catch (PersonalCheckedException e) {
      System.err.println("Поймали исключение " + e.getMessage());
    }
// Задача 4
    try {
      checkMailValidation("test@test.com");
      checkMailValidation("fdsfds");
    } catch (PersonalUncheckedException e) {
      System.err.println("Поймали исключение " + e.getMessage());
    }
  }

  public static double divide(int num1, int num2) {
    try {
      return num1 / num2;
    } catch (ArithmeticException e) {
      System.err.println("Ошибка при делении на ноль!!!");
      return Double.NaN;
    }
  }

  public static void checkUserAge(int age) throws PersonalCheckedException {
    if (age < 0 || age > 150) {
      throw new PersonalCheckedException("Возраст " + age + " не валидный!");
    } else {
      System.out.println("Возраст валидный");
    }
  }

  public static void checkMailValidation(String email) throws PersonalUncheckedException {

    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);

    if (!matcher.matches()) {
      throw new PersonalUncheckedException("Введенный email " + email + " невалидный!");
    } else {
      System.out.println("Email " + email + " валидный!");
    }
  }
}
