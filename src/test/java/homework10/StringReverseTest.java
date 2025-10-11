package homework10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StringReverseTest extends HomeworkTaskFunctionsTest {

  public static Stream<Arguments> validStringsToReverse() {
    return Stream.of(
        Arguments.of("hello", "olleh"),
        Arguments.of("", ""),
        Arguments.of("a", "a"),
        Arguments.of(null, null),
        Arguments.of("Azamat is automation QA", "AQ noitamotua si tamazA")
    );
  }


  /**
   * Напишите тесты для метода, который переворачивает строку: Тесты должны проверять: Обычные
   * строки Пустую строку null (должно возвращаться null) happy path: hello -> olleh corner cases:
   * "" -> "" "a" -> "a" null -> null
   */

  @ParameterizedTest
  @MethodSource("validStringsToReverse")
  public void userCanReverseValidString(String input, String expectedString) {
    String expectedResult = hwMethods.reverse(input);
    assertEquals(expectedString, expectedResult);
  }

}
