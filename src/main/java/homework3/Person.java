package homework3;

public class Person {

  private final String ssn;
  private String firstName;
  private String lastName;

  Person(String ssn, String firstName, String lastName) {
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getSsn() {
    return this.ssn;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void printPersonInfo() {
    System.out.println(
        "Имя: " + this.firstName + " Фамилия: " + this.lastName + " SSN: " + this.ssn);
  }
}
