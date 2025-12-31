package clean_code.homework3.task3;

public class Book {

  private final String title;
  private final String author;
  private final String description;
  private final String content = "Content of a book: Chapter1 ...";

  public Book(String title, String author, String description) {
    this.title = title;
    this.author = author;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getDescription() {
    return description;
  }

  public String getContent() {
    return content;
  }
}
