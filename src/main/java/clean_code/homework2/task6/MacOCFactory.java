package clean_code.homework2.task6;

public class MacOCFactory implements GuiFactory {

  @Override
  public Button createButtonElement() {
    return new MacOsButton();
  }

  @Override
  public Menu createMenuElement() {
    return new MacOsMenu();
  }

  @Override
  public Window createWindowElement() {
    return new MacOsWindow();
  }
}
