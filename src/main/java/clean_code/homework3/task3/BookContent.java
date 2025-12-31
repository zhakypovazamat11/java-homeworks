package clean_code.homework3.task3;

public class BookContent implements BookContentProvider {

  @Override
  public String loadContent(Book book) {
    return book.getContent();
  }

}
