package mock_interview.task2;

public class Main {

  /*Название задачи:
 Библиотека
Описание задачи:
 В библиотеке может храниться один документ, который может быть разного типа: книга, журнал или газета.
 Каждый документ содержит общую информацию (название и дату публикации), но отображается по-разному:
Книга показывает название и автора
Журнал — название и номер выпуска
Газета — название и дату выхода
Нужно создать систему, которая позволяет добавить документ в библиотеку и вывести о нём информацию с учётом его особенностей.

Library: List<Document> list
Document: Book(title, authorName, date), Magazine(title, date, number), Newspaper(title, date)
displayInfo()
   */
  public static void main(String[] args) {
    Document book = new Book("JavaCore", "11/12/1995", "Herbert Shield");
    Document magazine = new Magazine("NY Times", "18/11/2025", 10);
    Document newspaper = new Newspaper("Время", "18/11/2025");
    Library<Document> library = new Library<>();
    library.addDocument(book);
    library.addDocument(magazine);
    library.addDocument(newspaper);
    library.printInfo(book);
    library.printInfo(magazine);
    library.printInfo(newspaper);
  }
}
