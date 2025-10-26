package homework12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

  private static boolean validationEnabled = true;

  public static void setValidationEnabled(boolean validationEnabled) {
    UserValidator.validationEnabled = validationEnabled;
  }

  public void validate(User user) throws InvalidUserException {
    if (!validationEnabled) {
      return;
    }
    validateName(user);
    validateAge(user);
    validateEmail(user);
  }

  private void validateName(User user) throws InvalidUserException {
    if (user.getName() == null || user.getName().isEmpty()) {
      throw new InvalidUserException("Имя не может быть пустым");
    }
    if (!Character.isUpperCase(user.getName().charAt(0))) {
      throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
    }
  }

  private void validateAge(User user) throws InvalidUserException {
    if (user.getAge() > 100 || user.getAge() < 18) {
      throw new InvalidUserException("Возраст невалидный, должен быть от 18 до 100");
    }
  }

  private void validateEmail(User user) throws InvalidUserException {
    String regex = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(user.getEmail());

    if (!matcher.matches()) {
      throw new InvalidUserException("Введенный email " + user.getEmail() + " невалидный!");
    }
  }
}
