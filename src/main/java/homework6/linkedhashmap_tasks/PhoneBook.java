package homework6.linkedhashmap_tasks;

import java.util.LinkedHashMap;

public class PhoneBook {

  private LinkedHashMap<String, String> phoneBook;

  public PhoneBook() {
    phoneBook = new LinkedHashMap<>();
  }

  public void addContact(String name, String phoneNumber) {
    phoneBook.put(name, phoneNumber);
  }

  public void getContact(String name) {
    System.out.println(
        phoneBook.containsKey(name) ? phoneBook.get(name) : "Контакт не найден");
  }

  public void printContacts() {
    phoneBook.forEach(
        (name, number) -> {
          System.out.println(name + " " + number);
        }
    );
  }
}
