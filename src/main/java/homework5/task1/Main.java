package homework5.task1;

public class Main {

  public static void main(String[] args) {
    Zoo zooPark = new Zoo();
    Animal bird = new Bird();
    zooPark.add(bird);
    zooPark.forceMakeMove();
    zooPark.forceMakeSound();

  }

}
