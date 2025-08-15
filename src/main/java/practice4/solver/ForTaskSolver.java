package practice4.solver;

public class ForTaskSolver {

  public static void main(String[] args) {
    //multiplyTable(5);
    System.out.println(sumOfAllNumber(10));
    System.out.println(checkNumberIsPrime(7));
    System.out.println(checkNumberIsPrime(13));
    System.out.println(checkNumberIsPrime(4));
    printAllPrimeNumbersBefore100();
  }

  public static void multiplyTable(int number) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " * " + i + " = " + number * i);
    }
  }

  public static int sumOfAllNumber(int number) {
    int sum = 0;
    for (int i = 0; i <= number; i++) {
      sum += i;
    }

    return sum;
  }

  public static boolean checkNumberIsPrime(int num) {
    //необходимо пройтись от 2 до num-1 и проверить, есть ли хотя бы одно число
    // при делении на которое мы получаем остаток ноль.
    boolean isPrime = true;
    for (int i = 2; i <= num - 1; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }

  public static void printAllPrimeNumbersBefore100() {
    for (int i = 2; i <= 100; i++) {
      if (checkNumberIsPrime(i)) {
        System.out.print(i + ", ");
      }
    }
  }
}
