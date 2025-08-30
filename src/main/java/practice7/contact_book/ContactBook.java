package practice7.contact_book;

import java.util.HashMap;

public class ContactBook {

  //ключ значение
  private HashMap<String, Integer> contacts;

  public ContactBook() {
    this.contacts = new HashMap<>();
  }

  //добавить контакт
  public void addContact(String name, Integer phoneNumber) {
    contacts.put(name, phoneNumber);
  }

  //поиск контакта по имени
  public Integer getPhoneNumber(String name) {
    return contacts.get(name);
  }

  // обновление телефона по имени
  public void updateContact(String name, Integer newPhoneNumber) {
    contacts.put(name, newPhoneNumber);
  }

  public void printContacts() {
    System.out.println("Все контакты: ");
    contacts.forEach(
        (name, number) -> {
          System.out.println("Имя " + name + ", номер телефона " + number);
        }
    );
    System.out.println();
  }

}
