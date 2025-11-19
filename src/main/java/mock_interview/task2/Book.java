package mock_interview.task2;

public class Book extends Document {

  private final String author;

  public Book(String title, String date, String author) {
    super(title, date);
    this.author = author;
  }

  @Override
  void displayInfo() {
    System.out.println("Название " + title + " автор " + author);
  }
}
