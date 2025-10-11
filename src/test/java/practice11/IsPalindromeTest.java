package practice11;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPalindromeTest extends StringProcessorTest {

  /**
   * Тесты для проверки, является ли палиндромом: позитивные кейсы: - четное кол-во: "abba" -> true;
   * - нечетное кол-во: "hah" -> true; негативные кейсы: - "john" -> false corner cases: - "a" ->
   * true; - "" -> true; - null -> IllegalArgumentException
   */

  @ParameterizedTest
  @ValueSource(strings = {
      // positive cases
      "abba", "hah",
      // corner case
      "a", ""})
  public void userCanCheckIfValidStringIsPalindrome(String initialString) {
    boolean actualResult = stringProcessor.isPalindrome(initialString);
    assertTrue(actualResult);
  }

  @Test
  public void userCanCheckIfValidStringIsNotPalindrome() {
    String initialString = "john";
    boolean actualResult = stringProcessor.isPalindrome(initialString);
    assertFalse(actualResult);
  }

  @Test
  public void userCanNotCheckIfNullStringIsPalindrome() {
    assertThrows(IllegalArgumentException.class, () -> stringProcessor.isPalindrome(null),
        "Checking if Null string is palindrome should lead to IllegalArgumentException");
  }

}
