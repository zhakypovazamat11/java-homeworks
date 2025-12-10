package clean_code.homework2.task6;

public class Main {

  public static void main(String[] args) {
    GuiFactory factory = new MacOCFactory();
    factory.createButtonElement().drawButtonElement();
    factory.createMenuElement().drawMenuElement();
    factory.createWindowElement().drawWindowElement();

    GuiFactory factory1 = new WindowsFactory();
    factory1.createButtonElement().drawButtonElement();
    factory1.createMenuElement().drawMenuElement();
    factory1.createWindowElement().drawWindowElement();
  }

}
