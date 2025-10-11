package homework10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CountWordsInTextTest extends HomeworkTaskFunctionsTest {

  public static Stream<Arguments> userCanCountWordsFromText() {
    return Stream.of(
        Arguments.of("Hello! I try to execute Unit Test", 7),
        Arguments.of("", 0),
        Arguments.of("     ", 0),
        Arguments.of("HELLOWORLD", 1),
        Arguments.of(" Java is awesome", 3),
        Arguments.of("Java is awesome ", 3)
    );
  }

  @ParameterizedTest
  @MethodSource
  public void userCanCountWordsFromText(String inputText, int wordsCount) {
    assertEquals(wordsCount, hwMethods.countWords(inputText));
  }

  @Test
  public void userCanNotCountWordsWhenNullProvided() {
    assertThrows(IllegalArgumentException.class, () -> hwMethods.countWords(null),
        "Error Null can not be provided!");
  }
}
