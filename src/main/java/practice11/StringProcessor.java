package practice11;

public class StringProcessor {

  //метод для переворота строки
  public String reverseString(String input) {
    if (input == null) {
      throw new IllegalArgumentException("Input can not be null");
    }
    return new StringBuilder(input).reverse().toString();
  }

  //метод для проверки является ли строка палиндромом
  public boolean isPalindrome(String input) {
    if (input == null) {
      throw new IllegalArgumentException("Input can not be null");
    }
    String reversed = new StringBuilder(input).reverse().toString();

    return input.equals(reversed);
  }

  // Метод, который бросает исключение, если строка слишком короткая

  public String validateLength(String input, int minLength) {
    if (input == null) {
      throw new IllegalArgumentException("Input can not be null");
    }
    if (input.length() < minLength) {
      throw new IllegalArgumentException(
          "Input must be at least " + minLength + " ,but received " + input.length());
    }

    return input;
  }

}
