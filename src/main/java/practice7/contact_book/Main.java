package practice7.contact_book;

public class Main {

  public static void main(String[] args) {
    ContactBook contacts = new ContactBook();
    contacts.addContact("Ivan", 4343232);
    contacts.addContact("Petr", 7657);
    contacts.addContact("Kirill", 876);
    contacts.addContact("Alex", 436654232);
    contacts.printContacts();
    contacts.updateContact("Ivan", 74774);
    contacts.printContacts();
  }

}
