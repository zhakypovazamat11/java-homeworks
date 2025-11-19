package mock_interview;

import java.util.Arrays;

public class Main {

  /*
  Метод который проверяет что 2 строки является аннограммы
 [test, stet] -> true
 [enter, rente] -> true
 [google, coogle] -> false
 [null, fdsfs] -> false
 [null, null] -> false
 [" test ", "stet "] -> true
 ["Test", "stet"] -> true
   */
  public static void main(String[] args) {
    System.out.println(isAnogramm("test", "stet"));
    System.out.println(isAnogramm("en ter", "rent e"));
    System.out.println(isAnogramm("google", "coogle"));
    System.out.println(isAnogramm("null", "fdsfs"));
    System.out.println(isAnogramm(null, null));
    System.out.println(isAnogramm(" test ", "stet "));
    System.out.println(isAnogramm("Test", "stet"));
  }

  public static boolean isAnogramm(String str1, String str2) {
    if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
      return false;
    }
    char[] correctedString1 = str1.toLowerCase().replaceAll("\\s+", "").toCharArray();
    char[] correctedString2 = str2.toLowerCase().replaceAll("\\s+", "").toCharArray();
    Arrays.sort(correctedString1);
    Arrays.sort(correctedString2);
    return Arrays.equals(correctedString1, correctedString2);
  }

}
