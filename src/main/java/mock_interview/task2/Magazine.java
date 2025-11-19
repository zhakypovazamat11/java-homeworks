package mock_interview.task2;

public class Magazine extends Document {

  private final int number;

  public Magazine(String title, String date, int number) {
    super(title, date);
    this.number = number;
  }

  @Override
  void displayInfo() {
    System.out.println("Название " + title + " номер выпуска " + number);
  }
}
