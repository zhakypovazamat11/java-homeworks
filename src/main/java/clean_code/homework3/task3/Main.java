package clean_code.homework3.task3;

public class Main {

  public static void main(String[] args) {
    // Инициализация Bookbuilder для создания книги
    BookBuilder builder = new BookBuilder();
    Book book = builder.setTitle("War and Peace").setAuthor("Leo Tolstoy")
        .setDescription("A historical novel about the Napoleonic Wars.").build();
    // Инициализация roxy для ленивой загрузки
    BookProxy proxy = new BookProxy(book);
    //Доступ к содержимому книги через Рrоху, загрузка происходит только при первом обращении
    String content = proxy.getContent();
    System.out.println(content);
  }

}
