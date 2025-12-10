package clean_code.homework2.task9;

public class PdfFile {

  private String pdfFileName;

  public PdfFile(String name) {
    pdfFileName = name;
    System.out.println("Создан файл PdfFile{" +
        "pdfFileName='" + pdfFileName + '\'' +
        '}');
  }

  @Override
  public String toString() {
    return pdfFileName;
  }
}
