package homework3;

public class Company {

  static String companyName;
  final int employeeID;
  String employeeName;

  Company(int employeeID, String employeeName) {
    this.employeeID = employeeID;
    this.employeeName = employeeName;
  }

  static void printCompanyName() {
    System.out.println("Company Name: " + companyName);
  }

  public String getEmployeeName() {
    return this.employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  
}
