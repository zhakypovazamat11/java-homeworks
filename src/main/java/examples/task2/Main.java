package examples.task2;

public class Main {

//реализовать startWith

  //передается строка и суффикс, нужно вернуть true false
  // [Привет, п] -> true
  // [Привет, привет] -> true
  // [Привет, вет] -> false
  // [Привет, при] -> true
  public static boolean myStartWithFunction(String str, String prefix) {
    if (str == null || prefix == null || str.isEmpty() || prefix.isEmpty()) {
      throw new IllegalArgumentException("Неверный параметр");
    }
    for (int i = 0; i < prefix.length(); i++) {
      if (str.toLowerCase().charAt(i) != prefix.toLowerCase().charAt(i)) {
        return false;
      }
    }
    return true;
  }
}

