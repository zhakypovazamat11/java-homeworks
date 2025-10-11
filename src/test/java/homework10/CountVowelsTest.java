package homework10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CountVowelsTest extends HomeworkTaskFunctionsTest {

  public static Stream<Arguments> stringsWithVowels() {
    return Stream.of(
        Arguments.of("hello", 2),
        Arguments.of("java", 2),
        Arguments.of("AEIOU", 5)
    );
  }

  public static Stream<Arguments> stringsWithoutVowels() {
    return Stream.of(
        Arguments.of("", 0),
        Arguments.of("pwt", 0),
        Arguments.of("chtscz", 0)
    );
  }

  /**
   * Напишите тесты для метода, который считает количество гласных букв в строке: Разные строки
   * ("hello", "java", "AEIOU", "") null (должно выбрасываться исключение) Строки без гласных hello
   * -> 2, java -> 2, Угловые кейсы AEIOU -> 5 "" -> 0 null -> IllegalArgumentException
   * отрицательные кейсы pwt -> 0 chtscz -> 0
   */

  @ParameterizedTest
  @MethodSource("stringsWithVowels")
  public void userCanCountVowelsFromStringContainsVowels(String string, int vowelCounts) {
    int expectedResult = hwMethods.countVowels(string);
    assertEquals(expectedResult, vowelCounts);
  }

  @ParameterizedTest
  @MethodSource("stringsWithoutVowels")
  public void userCanCountVowelsFromStringWithoutVowels(String string, int vowelCounts) {
    int expectedResult = hwMethods.countVowels(string);
    assertEquals(expectedResult, vowelCounts);
  }

  @Test
  public void userCanNotCountVowelsFromNull() {
    assertThrows(IllegalArgumentException.class, () -> hwMethods.countVowels(null),
        "Argument can not be null!!");
  }


}
