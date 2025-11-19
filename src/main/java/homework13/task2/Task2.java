package homework13.task2;

import java.util.HashSet;
import java.util.Set;

public class Task2 {

  public static int prepareCollection() {
    Set<A> set = new HashSet<>();
    set.add(new A());
    set.add(new B());
    set.add(new B());
    return set.size();
  }

  public static void main(String[] args) {
    System.out.println(prepareCollection());
  }

}
