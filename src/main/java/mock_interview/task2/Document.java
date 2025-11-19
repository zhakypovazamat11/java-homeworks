package mock_interview.task2;

public abstract class Document {

  String title;
  String date;

  public Document(String title, String date) {
    this.title = title;
    this.date = date;
  }

  abstract void displayInfo();

}
