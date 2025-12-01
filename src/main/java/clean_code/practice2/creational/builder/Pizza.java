package clean_code.practice2.creational.builder;

class Pizza {

  private String dough;
  private String sauce;
  private String topping;

  public Pizza(String dough, String sauce, String topping) {
    this.dough = dough;
    this.sauce = sauce;
    this.topping = topping;
  }

  public Pizza(Builder builder) {
    dough = builder.dough;
    sauce = builder.sauce;
    topping = builder.topping;
  }

  @Override
  public String toString() {
    return "Pizza with " + dough + " dough, " + sauce + " sauce, " + topping + " topping.";
  }

  static class Builder {

    private String dough;
    private String sauce;
    private String topping;

    public Builder setDough(String dough) {
      this.dough = dough;
      return this;
    }

    public Builder setSauce(String sauce) {
      this.sauce = sauce;
      return this;
    }

    public Builder setTopping(String topping) {
      this.topping = topping;
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }
  }
}