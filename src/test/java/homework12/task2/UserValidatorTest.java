package homework12.task2;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserValidatorTest {

  UserValidator validator = new UserValidator();

  @BeforeEach
  public void enableValidator() {
    UserValidator.setValidationEnabled(true);
  }

  /**
   * Проверка валидации имени: 1) валидные имя: "Azamat", "AZAMAT", "An", "A" ; 2) невалидной имя
   * "", null, "azamat", " ", "a". Проверка валидации возраста: 1) валидный возраст 18, 19, 99, 100.
   * 2) невалидный возраст: 0, 17, 101. Проверка валидации email 1) валидный email "test@test.com"
   * 2) невалидный mail "test.com", "test@.c" Проверим при выключенной валидации
   */
  @ParameterizedTest
  @ValueSource(strings = {"Azamat", "AZAMAT", "An", "A"})
  public void shouldCheckMailValidationWithValidInput(String name) {
    User actualUser = new User(name, 18, "test@test.com");
    assertDoesNotThrow(() -> validator.validate(actualUser));
  }

  @ParameterizedTest
  @ValueSource(strings = {"", "azamat", " ", "a"})
  public void shouldCheckNameValidationWithInvalidInput(String name) {
    User actualUser = new User(name, 18, "test@test.com");
    assertThrows(InvalidUserException.class, () -> validator.validate(actualUser));
    User actualNullUser = new User(null, 18, "test@test.com");
    assertThrows(InvalidUserException.class, () -> validator.validate(actualNullUser));
  }

  @ParameterizedTest
  @ValueSource(ints = {18, 19, 99, 100})
  public void shouldCheckAgeValidationWithValidInput(int age) {
    User actualUser = new User("CorrectName", age, "test@test.com");
    assertDoesNotThrow(() -> validator.validate(actualUser));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 17, 101})
  public void shouldCheckAgeValidationWithInvalidInput(int age) {
    User actualUser = new User("CorrectName", age, "test@test.com");
    assertThrows(InvalidUserException.class, () -> validator.validate(actualUser));
  }

  @Test
  public void shouldCheckMailValidationWithValidInput() {
    User actualUser = new User("CorrectName", 18, "test@test.com");
    assertDoesNotThrow(() -> validator.validate(actualUser));
  }

  @ParameterizedTest
  @ValueSource(strings = {"test.com", "test@.c"})
  public void shouldCheckMailValidationWithInvalidInput(String email) {
    User actualUser = new User("CorrectName", 18, email);
    assertThrows(InvalidUserException.class, () -> validator.validate(actualUser));
  }

  @Test
  public void shouldDisableValidationAndCheckThatNoErrorThrown() {
    UserValidator.setValidationEnabled(false);
    User actualUser = new User("incorrectName", 17, "incorrectEmail");
    assertDoesNotThrow(() -> validator.validate(actualUser));
  }


}
