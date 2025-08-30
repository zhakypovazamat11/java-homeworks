package homework6.linkedhashmap_tasks;

public class Main {

  public static void main(String[] args) {
    //Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.addContact("Азамат", "996553213713");
    phoneBook.addContact("Азамат", "996553213713");
    phoneBook.addContact("Петя", "996558553553");
    phoneBook.addContact("Иван", "996552523533");
    phoneBook.addContact("Игорь", "996555153253");
    phoneBook.printContacts();
    phoneBook.getContact("Азамат");
    phoneBook.getContact("Витя");
  }
}
