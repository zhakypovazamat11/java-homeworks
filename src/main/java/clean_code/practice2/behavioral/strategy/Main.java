package clean_code.practice2.behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    Navigator navigator = new Navigator(new FastestRouteStrategy());
    navigator.buildRoute();
    navigator.setStrategy(new LeastTurnsRouteStrategy());
    navigator.buildRoute();
  }
}
