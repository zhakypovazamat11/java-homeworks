package clean_code.practice2.behavioral.strategy;

class Navigator {

  private RouteStrategy strategy;

  public Navigator(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(RouteStrategy strategy) {
    this.strategy = strategy;
  }

  public void buildRoute() {
    strategy.buildRoute();
  }
}
