package homework3;

public class University {

  static String universityName;
  final int studentID;
  String studentName;

  University(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
  }

  public static void changeUniversityName(String newName) {
    universityName = newName;
  }

  public String getStudentName() {
    return this.studentName;
  }

  public void printStudentInfo() {
    System.out.println(this.studentID + " " + this.studentName + " " + universityName);
  }
}
