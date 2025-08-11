package homework2;

public class Point {

  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void print() {
    System.out.println("Coordinates: (" + this.x + ", " + this.y + ").");
  }
}
