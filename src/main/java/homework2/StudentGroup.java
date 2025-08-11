package homework2;

public class StudentGroup {

  String groupName;
  int studentCount;

  StudentGroup(String groupName, int studentCount) {
    this.groupName = groupName;
    this.studentCount = studentCount;
  }

  public String getGroupName() {
    return this.groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public int getStudentCount() {
    return this.studentCount;
  }

  public void setStudentCount(int studentCount) {
    this.studentCount = studentCount;
  }

  public void printInfo() {
    System.out.println("Group: " + this.groupName + " students: " + this.studentCount);
  }
}
