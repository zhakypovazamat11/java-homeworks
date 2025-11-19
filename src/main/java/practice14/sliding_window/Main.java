package practice14.sliding_window;

public class Main {

  /* Найти макс сумму массива длиной k подмассива
   * [1, 2, 3, 4] k = 2 -> 7
   * [5, 10, 25, 3, 2] k = 3 -> 40 */

  public static void main(String[] args) {
    System.out.println(getMaxValueOfSubarray(new int[]{5, 10, 25, 3, 2}, 3));
  }

  public static int getMaxValueOfSubarray(int[] array, int k) {
    if (array == null || array.length < k) {
      return 0;
    }
    int sum = 0;
    int max = 0;
    for (int i = 0; i < k; i++) {
      sum += array[i];
    }
    for (int i = k; i < array.length; i++) {
      if (max < sum) {
        max = sum;
      }
      sum += array[i] - array[i - k];
      max = Math.max(max, sum);
    }
    return max;
  }

}
