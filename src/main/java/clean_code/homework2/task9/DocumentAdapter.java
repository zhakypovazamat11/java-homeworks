package clean_code.homework2.task9;

public class DocumentAdapter {


  public DocFile convertFromPdfToDoc(PdfFile pdfFileName) {
    System.out.println("Конвертируем файл pdf: " + pdfFileName.toString() + " на doc расширение");
    String docFileName = pdfFileName.toString().replace(".pdf", ".doc");

    return new DocFile(docFileName);
  }

}
