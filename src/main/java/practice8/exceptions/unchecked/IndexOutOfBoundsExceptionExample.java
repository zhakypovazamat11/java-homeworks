package practice8.exceptions.unchecked;

public class IndexOutOfBoundsExceptionExample {

  public static void main(String[] args) {
    try {
      int[] num = {0, 1, 2};
      int numbers = num[5];
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Попытка доступа к индексу за пределами массива!");
    } // можно было и без конструкции try catch, но тогда бы программа остановилась
  }
}
