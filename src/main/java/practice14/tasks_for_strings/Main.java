package practice14.tasks_for_strings;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(revertedWords(" the sky is blue "));
    System.out.println(getRepeatNumberOfChars("java"));
  }

  /* Палиндром(игнорируем не-буквенно-цифровые, регистр не важен)
  П-р: "A man, a plan, a canal: Panama" -> true
  "race a car" -> false
   */
  public static boolean isPalindrome(String str) {
    String filteredString = str.toLowerCase().replaceAll("[^a-z0-9]", "");
    StringBuilder stringBuilder = new StringBuilder(filteredString);
    return stringBuilder.reverse().toString().equals(filteredString);
  }

  /* Перевернуть слова в строке(сжать пробелы)
  " the sky is blue " -> "blue is sky the"
  "hello world" -> "world hello"
   */
  public static String revertedWords(String string) {
    String[] arrayOfWords = string.trim().toLowerCase().split("\\s+");
    StringBuilder str = new StringBuilder();
    for (int i = arrayOfWords.length - 1; i >= 0; i--) {
      str.append(arrayOfWords[i]);
      if (i != 0) {
        str.append(" ");
      }
    }
    return str.toString();
  }

  /* Посчитать кол-во вхождений каждого символа
  П-р: java -> j-1, a-2, v-1
  12g -> 1-1, 2-1, g-1
  :#$@## -> :-1, #-3,$-1,@-1
  Алгоритм
  Идти по каждому символу строки, и если нет символа в ключе добавь
  если для символа есть значение - то обновляю, + 1
   */

  public static Map<Character, Integer> getRepeatNumberOfChars(String value) {
    Map<Character, Integer> freq = new HashMap<>();
    for (char c : value.toLowerCase().toCharArray()) {
/*      if (!freq.containsKey(c)) {
        freq.put(c, 1);
      } else {
        Integer freqForC = freq.get(c);
        freq.put(c, freqForC + 1);
      }*/
      freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    return freq;
  }

}
