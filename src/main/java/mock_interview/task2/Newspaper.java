package mock_interview.task2;

public class Newspaper extends Document {

  public Newspaper(String title, String date) {
    super(title, date);
  }

  @Override
  void displayInfo() {
    System.out.println("Название " + title + " дата выхода " + date);
  }
}
