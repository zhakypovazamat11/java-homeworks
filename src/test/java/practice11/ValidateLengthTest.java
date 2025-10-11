package practice11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ValidateLengthTest extends StringProcessorTest {

  /**
   * Тесты на валидацию длины позитивные кейсы "abba", 3 -> "abba" "abba", 4 -> abba негативный кейс
   * "abba", 5 -> IllegalArgumentException угловые сценарии "abba", 0 -> "abba" "", 0 -> "" "hello",
   * -1 -> IllegalArgumentException
   */
  public static Stream<Arguments> stringForValidationPositiveCases() {
    return Stream.of(
        // позитивные сценарии
        Arguments.of("abba", 3),
        Arguments.of("abba", 4),
        // угловые сценарии
        Arguments.of("abba", 0),
        Arguments.of("", 0)
    );
  }

  public static Stream<Arguments> stringForValidationNegativeCases() {
    return Stream.of(
        // позитивные сценарии
        Arguments.of("abba", 5),
        // угловые сценарии
        Arguments.of("hello", -1)
    );
  }

  @ParameterizedTest
  @MethodSource("stringForValidationPositiveCases")
  public void userCanValidateStringWithLengthMoreThanOrEqualToMinValue(String initialString,
      int minValue) {
    String expectedResult = stringProcessor.validateLength(initialString, minValue);
    assertEquals(expectedResult, initialString);
  }

  @ParameterizedTest
  @MethodSource("stringForValidationNegativeCases")
  public void userCanNotValidateStringWithLengthLessThanOrEqualToMinValue(
      String initialString,
      int minValue) {
    assertThrows(IllegalArgumentException.class,
        () -> stringProcessor.validateLength(initialString, minValue),
        "Validation of string with length less than minValue should lead to exception");
  }

}
