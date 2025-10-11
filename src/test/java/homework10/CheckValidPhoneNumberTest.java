package homework10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckValidPhoneNumberTest extends HomeworkTaskFunctionsTest {

  @ParameterizedTest
  @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
  public void userCanCheckIfPhoneNumberCorrectWithValidNumber(String number) {
    assertTrue(hwMethods.isValidPhoneNumber(number));
  }

  @ParameterizedTest
  @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", " +1 123", "",
      " "})
  public void userCanCheckIfPhoneNumberInCorrectWithInvalidNumber(String number) {
    assertFalse(hwMethods.isValidPhoneNumber(number));
  }

  @Test
  public void userCanCheckIfPhoneNumberIncorrectWhenNullProvided() {
    assertThrows(IllegalArgumentException.class, () -> hwMethods.isValidPhoneNumber(null),
        "NUll can not be provided");
  }


}
