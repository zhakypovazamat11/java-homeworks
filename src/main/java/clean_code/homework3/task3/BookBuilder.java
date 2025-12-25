package clean_code.homework3.task3;

public class BookBuilder {

  protected String title;
  protected String author;
  protected String description;

  public BookBuilder setTitle(String title) {
    this.title = title;
    return this;
  }

  public BookBuilder setAuthor(String author) {
    this.author = author;
    return this;
  }

  public BookBuilder setDescription(String description) {
    this.description = description;
    return this;
  }

  public Book build() {
    return new Book(this);
  }
}
