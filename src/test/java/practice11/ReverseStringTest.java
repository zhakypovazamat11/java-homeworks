package practice11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Class StringProcessor, method reverse")
public class ReverseStringTest extends StringProcessorTest {

  public static Stream<Arguments> validStringsToReverse() {
    return Stream.of(
        //happy pass: 'sasha' -> 'ahsas';
        Arguments.of("sasha", "ahsas"),
        //corner cases: '' -> ''
        Arguments.of("", ""),
        //corner cases: 'a'-> 'a'
        Arguments.of("a", "a"));
  }

  /**
   * Тесты для переворота строки: happy path: sasha -> ahsas corner cases: "" -> "" "a" -> "a" null
   * -> IllegalArgument Exception
   *
   */
  @ParameterizedTest //чтобы тест стал исполняемый
  @MethodSource("validStringsToReverse")
  public void userCanReverseValidString(String initialString, String expectedString) {
    String reversedString = stringProcessor.reverseString(initialString);
    assertEquals(expectedString, reversedString,
        "String reversed incorrectly");
  }

  @Test
  public void userCanNotReverseNullString() {
    assertThrows(IllegalArgumentException.class, () -> stringProcessor.reverseString(null),
        "Reversing of null string should lead to IllegalArgumentException");

  }

}
