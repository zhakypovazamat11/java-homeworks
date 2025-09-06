package practice8.library;

import java.util.Objects;

public class Book {

  private String name;
  private String author;

  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;

    return Objects.equals(name, book.name) && Objects.equals(author, book.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, author);
  }
}
