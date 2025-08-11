package homework2;

public class Book {

  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void printInfo() {
    System.out.println("Title " + this.title + " author " + this.author);
  }
}
