package clean_code.homework3.task3;

public class BookProxy {

  private Book book;
  private boolean isLoaded = false;

  public BookProxy(Book book) {
    this.book = book;
  }

  public String getContent() {
    String cashedContent = "";
    if (!isLoaded) {
      BookContentProvider content = new BookContent();
      cashedContent = content.loadContent(book);
      isLoaded = true;
    }
    return cashedContent;
  }
}
