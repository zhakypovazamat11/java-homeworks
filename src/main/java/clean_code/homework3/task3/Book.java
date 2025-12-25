package clean_code.homework3.task3;

public class Book {

  private String title;
  private String author;
  private String description;
  private String content;

  public Book(String title, String author, String description) {
    this.title = title;
    this.author = author;
    this.description = description;
  }

  public Book(BookBuilder builder) {
    this.title = builder.title;
    this.author = builder.author;
    this.description = builder.description;
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

  public void setContent(String content) {
    this.content = content;
  }
}
