package homework10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsLeapYearTest extends HomeworkTaskFunctionsTest {

  /**
   * Напишите тесты для метода, который определяет, является ли год високосным: Тесты должны
   * проверять: Обычные годы 2019, 2021, 2022 Високосные (2020, 2000, 1600) Года, которые делятся на
   * 100, но не на 400 Positive (2020, 2000, 1600) - true corner cases 0, 4, 400 → true negative
   * 2019, 2021, 2022 - false (1900, 2100) - false
   */
  @ParameterizedTest
  @ValueSource(ints = {2020, 2000, 1600,
      //corner cases
      0, 4, 400})
  public void userCanCheckIfYearIsLeapWithValidInput(int year) {
    assertTrue(hwMethods.isLeapYear(year));
  }

  @ParameterizedTest
  @ValueSource(ints = {2019, 2021, 2022, 1900, 2100})
  public void userCanCheckIfYearIsLeapWithInvalidInput(int year) {
    assertFalse(hwMethods.isLeapYear(year));
  }


}
