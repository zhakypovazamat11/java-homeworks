package clean_code.homework2.task9;

public class DocFile {

  private String docFileName;

  public DocFile(String name) {
    docFileName = name;
    System.out.println("Создан файл DocFile{" +
        "docFileName='" + docFileName + '\'' +
        '}');
  }

  @Override
  public String toString() {
    return docFileName;
  }
}
