package practice8.library.exceptions;

import practice8.library.Book;
import practice8.library.Library;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();
    library.addBook(new Book("1994", "Оруелл"));
    library.addBook(new Book("Мартин Иден", "Лондон"));
    library.addBook(new Book("Онегин", "Пушкин"));
    //library.addBook(new Book("Онегин", "Пушкин"));
    try {
      library.findBook("3434");
    } catch (BookNotFoundException e) {
      System.out.println("Поймали исключение!!!");
    }
  }

}
