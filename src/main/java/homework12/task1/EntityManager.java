package homework12.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {

  CopyOnWriteArrayList<T> manager = new CopyOnWriteArrayList<>();

  public void addEntity(T entity) {
    manager.add(entity);
  }

  public boolean removeEntity(T entity) {
    return manager.remove(entity);
  }

  public List<T> getAll() {
    return List.copyOf(manager);
  }

  public List<T> filterByAge(int minAge, int maxAge) {
    if (minAge <= 0 || maxAge <= 0) {
      throw new IllegalArgumentException("Age range can not be negative or zero numbers");
    }
    return manager.stream()
        .filter((T entity) -> entity.getAge() >= minAge && entity.getAge() <= maxAge).toList();
  }

  public List<T> filterByName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Argument name can not be null!");
    }
    return manager.stream().filter((T entity) -> entity.getName().equalsIgnoreCase(name)).toList();
  }

  public List<T> filterByStatus(boolean isActive) {
    return manager.stream()
        .filter(user -> user.isActive() == isActive).collect(Collectors.toList());
  }
}


