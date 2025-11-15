package homework13.task9;

public class Main {

  public static void main(String[] args) {
    var a = new int[1];
    a[0] = 21;
    Integer b = Integer.valueOf(17);
    inc(a[0]);
    inc(b);
    System.out.println(a[0]);
    System.out.println(b);
  }


  public static void inc(int[] a) {
    a[0]++;
  }

  public static void inc(int a) {
    a++;
  }

  public static void inc(Integer b) {
    b++;
  }
}
