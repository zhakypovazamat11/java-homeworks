package homework5.task8;

public class Main {

  public static void main(String[] args) {
    Museum museum = new Museum();
    Exhibit manuscript = new Manuscript();
    museum.setExhibit(manuscript);
    museum.printExhibit();
    museum.preserveExhibit();
  }

}
