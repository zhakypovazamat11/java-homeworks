package examples;

public class Main {

  public static void main(String[] args) {
    Eatable cat = new Cat();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();

    tiger.eat(cat);
    //tiger.eat(lion);
  }

}
