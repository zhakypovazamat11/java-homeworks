package clean_code.practice2.creational.abstractfabric;

class WindowsCheckbox implements Checkbox {

  public void paint() {
    System.out.println("Render a Windows checkbox.");
  }
}