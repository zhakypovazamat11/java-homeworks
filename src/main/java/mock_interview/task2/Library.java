package mock_interview.task2;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Document> {

  List<Document> list = new ArrayList<>();

  public void addDocument(Document document) {
    list.add(document);
  }

  public void printInfo(Document document) {
    document.displayInfo();
  }

}
