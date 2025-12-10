package clean_code.homework2.task6;

public class WindowsFactory implements GuiFactory {

  @Override
  public Button createButtonElement() {
    return new WindowsButton();
  }

  @Override
  public Menu createMenuElement() {
    return new WindowsMenu();
  }

  @Override
  public Window createWindowElement() {
    return new WindowsWindow();
  }
}
