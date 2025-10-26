package homework12.task1;

import java.util.Objects;

public class User extends Entity {

  public User(String name, int age, boolean isActive) {
    super(name, age, isActive);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }
    User that = (User) obj;
    return this.getAge() == that.getAge() &&
        this.getName().equals(that.getName()) &&
        this.isActive() == that.isActive();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getAge(), isActive());
  }
}
