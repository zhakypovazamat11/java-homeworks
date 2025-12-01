package clean_code.practice2.creational.abstractfabric;

public class Main {

  public static void main(String[] args) {
    GUIFactory guiFactory;
    String osType = "Windows";

    if ("Windows".equals(osType)) {
      guiFactory = new WindowsFactory(); // фабричный метод
    } else {
      guiFactory = new MacOsFactory();// фабричный метод
    }

    guiFactory.createButton().paint();
    guiFactory.createCheckbox().paint();
  }
}
