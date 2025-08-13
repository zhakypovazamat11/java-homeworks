package homework3;

public class LibraryTest {

  public static void main(String[] args) {
    Library library1 = new Library();
    //library1.bookTitle = "JAva"
    library1.category = "IT";
    library1.author = "Herbert Shildt";
    library1.year = 2000;
    library1.setBookTitle("Herbert");
    System.out.println(library1.category);
    System.out.println(library1.author);
    System.out.println(library1.year);
    System.out.println(library1.getBookTitle());
    library1.setBookTitle("Test1");
    System.out.println(library1.getBookTitle());
  }

}
