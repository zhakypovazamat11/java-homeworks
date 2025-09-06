package practice8.library;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import practice8.library.exceptions.BookNotFoundException;
import practice8.library.exceptions.InvalidBookException;

public class Library {

  private List<Book> bookList;

  public Library() {
    this.bookList = new ArrayList<>();
  }

  // Добавлять книгу
  // Обработка исключения: если добавляем существующую книгу,
  // то получаем непроверяемое исключение InvalidBookException
  public void addBook(Book book) throws InvalidBookException {
    if (bookList.contains(book)) {
      throw new InvalidBookException("Такая книга уже существует!!! ");
    } else {
      bookList.add(book);
    }
  }
  // искать книгу
  // Обработка исключения: если мы не можем найти книгу, то случиться проверяемое исключение
  // BookNotFoundException

  public Book findBook(String name) throws BookNotFoundException {
    AtomicReference<Book> foundBook = new AtomicReference<>();
    bookList.forEach(book -> {
      if (book.getName() == name) {
        foundBook.set(book);
      }
    });
    if (foundBook.get() == null) {
      throw new BookNotFoundException("Не нашли книгу по имени " + name);
    }
    return foundBook.get();
  }
}
