package homework11;

public class DebugTask4 {

  public static void main(String[] args) {
    System.out.println(isPalindrome("abba"));
  }

  public static boolean isPalindrome(String str) {
    if (str == null) {
      throw new IllegalArgumentException("Input can not be null");
    }
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
  }

}
