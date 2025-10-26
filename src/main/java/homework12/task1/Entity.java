package homework12.task1;

public abstract class Entity {

  private String name;
  private int age;
  private boolean isActive;

  public Entity(String name, int age, boolean isActive) {
    this.name = name;
    this.age = age;
    this.isActive = isActive;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public boolean isActive() {
    return this.isActive;
  }

}
