package clean_code.homework2.task9;

public class DOCProcessor implements DocumentProcessor {

  private DocFile docFile;

  public DOCProcessor(DocFile docFile) {
    this.docFile = docFile;
  }


  @Override
  public void process() {
    System.out.println("Обрабатываем файл: " + docFile.toString());
  }
}
