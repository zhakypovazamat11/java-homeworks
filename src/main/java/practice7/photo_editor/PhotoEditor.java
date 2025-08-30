package practice7.photo_editor;

import java.util.Stack;

public class PhotoEditor {

  private Stack<String> actions;

  public PhotoEditor() {
    this.actions = new Stack<>();
  }

  public void addNewAction(String action) {
    actions.push(action);
  }

  public void undoLastAction() {
    actions.pop();
  }

  public void printActions() {
    System.out.println("Все действия: ");
    actions.forEach(System.out::println);
  }
}
