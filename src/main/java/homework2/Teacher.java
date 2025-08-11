package homework2;

public class Teacher {

  String name;
  String subject;

  Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void printInfo() {
    System.out.println("Teacher name: " + this.name + " subject " + this.subject);
  }
}
