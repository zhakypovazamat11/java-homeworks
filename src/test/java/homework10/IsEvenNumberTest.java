package homework10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsEvenNumberTest extends HomeworkTaskFunctionsTest {

  /**
   * Напишите тесты для метода, который определяет, является ли число чётным: Тесты должны
   * проверять: Чётные и нечётные числа 2 -> true 3 -> false Нулевое значение 0 -> true
   * Отрицательные числа -4 -> true -3 -> false
   */
  @ParameterizedTest
  @ValueSource(ints = {2, 0, -4})
  public void userCanCheckIfNumberIsEven(int number) {
    assertTrue(hwMethods.isEven(number));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, -5})
  public void userCanCheckIfNumberIsOdd(int number) {
    assertFalse(hwMethods.isEven(number));
  }

}
