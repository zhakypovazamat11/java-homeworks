package practice8.exceptions.unchecked;

public class NullPointerExceptionExample {

  public static void main(String[] args) {
    try {
      String text = null;
      int length = text.length();
    } catch (NullPointerException e) {
      System.out.println("Попытка вызова у null объекта");
    }
  }

}
