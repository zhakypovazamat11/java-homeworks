package practice8.library.exceptions;

//непроверяемое исключение
public class InvalidBookException extends RuntimeException {

  public InvalidBookException(String message) {
    super(message);
  }

}
