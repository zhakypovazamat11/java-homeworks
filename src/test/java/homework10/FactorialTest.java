package homework10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FactorialTest extends HomeworkTaskFunctionsTest {

  public static Stream<Arguments> positiveNumbersToCalculateFactorial() {
    return Stream.of(
        Arguments.of(0, 1),
        Arguments.of(1, 1),
        Arguments.of(5, 120),
        Arguments.of(7, 5040)
    );
  }

  /**
   * Напишите тесты для метода, который вычисляет факториал числа: Positive cases: 5! -> 120; 7! ->
   * 5040; Угловой кейс 0! -> 1 1! -> 1 Negative case: -5 -> IllegalArgumentException
   */

  @ParameterizedTest
  @MethodSource("positiveNumbersToCalculateFactorial")
  public void userCanCalculateFactorialOfPositiveNumbers(int inputNumber, int expectedResult) {
    assertEquals(hwMethods.factorial(inputNumber), expectedResult);
  }

  @Test
  public void userCanNotCalculateFactorialOfNegativeNumbers() {
    assertThrows(IllegalArgumentException.class, () -> hwMethods.factorial(-5),
        "Can not calculate factorial for negative number");
  }

}
