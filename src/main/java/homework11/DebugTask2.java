package homework11;

public class DebugTask2 {

  public static void main(String[] args) {
    int sum = calculateSum(5);
    System.out.println("Sum: " + sum);
  }

  public static int calculateSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n;
        i++) { // Уточнение 5 включена или нет если да - то задача верная, если нет - то нужно поменять в цикле i < n
      sum += i;
    }
    return sum;
  }
}
