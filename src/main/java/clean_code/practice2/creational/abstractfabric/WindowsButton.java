package clean_code.practice2.creational.abstractfabric;

class WindowsButton implements Button {

  public void paint() {
    System.out.println("Render a Windows button.");
  }
}