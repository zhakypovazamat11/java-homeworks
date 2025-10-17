package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
    names.removeIf(name -> name.startsWith("A"));
    names.forEach(System.out::println);
  }
}