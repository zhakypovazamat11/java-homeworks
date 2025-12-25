package clean_code.homework3.task3;

public class BookProxy {

  private Book book;
  private boolean isLoaded = false;

  public BookProxy(Book book) {
    this.book = book;
  }

  public String getContent() {
    if (!isLoaded) {
      book.setContent("Content of a book: " + book.getTitle() + " by " + book.getAuthor());
      isLoaded = true;
    }
    return book.getContent();
  }
}
