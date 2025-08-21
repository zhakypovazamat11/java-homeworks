package homework5.task8;

public class Museum {

  private Exhibit exhibit;

  public void setExhibit(Exhibit exhibit) {
    this.exhibit = exhibit;
  }

  public void printExhibit() {
    this.exhibit.info();
  }

  public void preserveExhibit() {
    this.exhibit.preserve();
  }
}
