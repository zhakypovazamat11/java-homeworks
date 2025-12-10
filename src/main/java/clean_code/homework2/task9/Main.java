package clean_code.homework2.task9;

public class Main {

  public static void main(String[] args) {
    PdfFile pdfFile = new PdfFile("Книга по проектированию.pdf");
    DocumentAdapter documentAdapter = new DocumentAdapter();
    DOCProcessor docProcessor = new DOCProcessor(documentAdapter.convertFromPdfToDoc(pdfFile));
    docProcessor.process();
  }

}
