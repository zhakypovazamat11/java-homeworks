package practice8.errors;


import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExamples {

  public static void main(String[] args) {

    List<Object> list = new ArrayList<>();
    while (true) {
      list.add(new byte[1024 * 1024]);
      System.out.println("added 1mb");
    }
  }
}
