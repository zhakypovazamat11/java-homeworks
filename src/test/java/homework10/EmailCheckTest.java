package homework10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailCheckTest extends HomeworkTaskFunctionsTest {

  /**
   * Напишите тесты для метода, который проверяет, является ли строка валидным email: Позитивный
   * сценарий test@example.com -> true Негативный сценарий bad@.com -> false no-at-symbol -> false
   * test@com -> false Угловые сцерании null -> false "" -> false "a" -> false
   */
  @ParameterizedTest
  @ValueSource(strings = {"user.name@domain.co", "a@b.cc", "user.name@domain.co"})
  public void userCanCheckIfMailValidWithCorrectEmail(String input) {
    assertTrue(hwMethods.isValidEmail(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"bad@.com", "no-at-symbol", "test@com", "@missing-user.com", "a", ""})
  public void userCanCheckIfMailNotValidWithIncorrectEmail(String input) {
    assertFalse(hwMethods.isValidEmail(input));
  }

  @Test
  public void userCanCheckIfMailNotValidWithNull() {
    assertFalse(hwMethods.isValidEmail(null));
  }

}
