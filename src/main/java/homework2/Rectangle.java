package homework2;

public class Rectangle {

  int width;
  int height;

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getHeight() {
    return this.height;
  }

  public int getWidth() {
    return this.width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int calculateArea() {
    return this.width * this.height;
  }
}
