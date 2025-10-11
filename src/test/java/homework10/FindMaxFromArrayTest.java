package homework10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindMaxFromArrayTest extends HomeworkTaskFunctionsTest {

  public static Stream<Arguments> userCanReturnMaxElementFromArray() {
    return Stream.of(
        Arguments.of(new int[]{3, 5, 7, 2}, 7),
        Arguments.of(new int[]{0}, 0),
        Arguments.of(new int[]{1}, 1),
        Arguments.of(new int[]{-4, -5, -7}, -4)
    );
  }

  /**
   * Напишите тесты для метода, который находит максимальное число в массиве: Тесты должны
   * проверять: Позитивные кейсы: Обычный массив ([3, 5, 7, 2]) -> 7 Угловые кейсы: Один элемент в
   * массиве ([0]) -> 0 [1] -> 1 Отрицательные числа ([-4, -5, -7]) Пустой массив (должно
   * выбрасываться исключение)[] -> IllegalArgumentException
   */

  @ParameterizedTest
  @MethodSource
  public void userCanReturnMaxElementFromArray(int[] array, int expectedResult) {
    int actualResult = hwMethods.findMax(array);
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void userCanNotReturnFromEmptyArray() {
    assertThrows(NoSuchElementException.class, () -> hwMethods.findMax(new int[]{}),
        "Array is Empty, throw NoSuchElementException");
  }

  @Test
  public void userCanNotReturnFromNull() {
    assertThrows(NullPointerException.class, () -> hwMethods.findMax(null),
        "Can not Return max value from Null");
  }

}
