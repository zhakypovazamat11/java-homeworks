package problem_answer_book.oop_in_java.task13;

public class Canvas {

  private Drawable shape;

  public void draw() {
    this.shape.draw();
  }

  public void setShape(Drawable shape) {
    this.shape = shape;
  }
}
