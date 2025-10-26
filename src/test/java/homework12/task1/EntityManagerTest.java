package homework12.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EntityManagerTest {

  EntityManager<User> manager;
  int initialSize;

  public static Stream<Arguments> validAgeRanges() {
    return Stream.of(
        Arguments.of(10, 18, 1),
        Arguments.of(30, 40, 2)
    );
  }

  public static Stream<Arguments> invalidAgeRanges() {
    return Stream.of(
        Arguments.of(-10, 0),
        Arguments.of(0, -10),
        Arguments.of(0, 0)
    );
  }

  public static Stream<Arguments> nameToFilter() {
    return Stream.of(
        Arguments.of("Azamat", 4),
        Arguments.of("azamaT", 4),
        Arguments.of("azamat", 4),
        Arguments.of("AZAMAT", 4),
        Arguments.of("Aza", 1),
        Arguments.of("Petya", 0)
    );
  }

  public static Stream<Arguments> filterByStatusArgument() {
    User user1 = new User("User1", 18, true);
    User user2 = new User("User2", 30, true);
    User user3 = new User("User3", 40, false);
    User user4 = new User("User4", 29, false);
    return Stream.of(
        // userList, isActive, counts
        Arguments.of(List.of(user3), true, 0),
        Arguments.of(List.of(user1, user3), true, 1),
        Arguments.of(List.of(user1, user2, user3), true, 2),
        Arguments.of(List.of(user1), false, 0),
        Arguments.of(List.of(user1, user3), false, 1),
        Arguments.of(List.of(user1, user3, user4), false, 2)
    );
  }


  @BeforeEach
  public void setUp() {
    manager = new EntityManager<>();
    initialSize = manager.getAll().size();
  }

  /**
   * Тест на добавление элемента: Проверить, возможность добавления. Проверить, что добавился 1
   * элемент
   */
  @Test
  public void shouldCheckAdditionOfUser() {
    manager.addEntity(new User("Aleksei", 22, true));
    // Проверим, что размер листа увеличился на 1, при добавлении 1-го Юзера
    assertEquals(initialSize + 1, manager.getAll().size());
    // Проверить, что добавленный юзер содержится в списке
    User expectedUser = new User("Aleksei", 22, true);
    User actualUser = manager.getAll().getFirst();
    assertEquals(expectedUser, actualUser);
  }

  /**
   * Тест на удаление элемента: Проверить, что при удалении из листа возвращается true, если объект
   * был удалён, и false, если объект не найден в коллекции
   */
  @Test
  public void shouldCheckRemovingOfUser() {
    User userToRemove = new User("Aleksei", 22, true);
    User userNotFromList = new User("Petya", 30, true);
    manager.addEntity(userToRemove);
    assertTrue(manager.removeEntity(userToRemove));
    assertEquals(initialSize, manager.getAll().size());
    assertFalse(manager.removeEntity(userNotFromList));
  }

  /**
   * Получение на получение всех элементов
   */
  @Test
  public void shouldCheckGettingOfAllElements() {
    User user1 = new User("Aleksei", 22, true);
    User user2 = new User("Petya", 30, true);
    User user3 = new User("Kolya", 35, true);
    manager.addEntity(user1);
    manager.addEntity(user2);
    manager.addEntity(user3);
    int expectedCountOfUsers = 3;
    assertEquals(expectedCountOfUsers, manager.getAll().size());
    List<User> expectedList = List.of(user1, user2, user3);
    assertEquals(expectedList, manager.getAll());

  }

  /**
   * фильтрация возраста по-заданному диапазону: кейс когда 1 элемент подпадает под условия, кейс
   * когда 2 элемента, кейсы с граничными условиями кейсы с нулевым и отрицательным возрастом
   */
  @ParameterizedTest
  @MethodSource("validAgeRanges")
  public void shouldCheckFilterByAgeWithValidInput(int minAge, int maxAge,
      int expectedCountOfElements) {
    manager.addEntity(new User("User1", 18, true));
    manager.addEntity(new User("User2", 30, true));
    manager.addEntity(new User("User3", 40, true));
    manager.addEntity(new User("User4", 29, true));
    manager.addEntity(new User("User5", 41, true));
    int actualNumberOfElements = manager.filterByAge(minAge, maxAge).size();
    assertEquals(expectedCountOfElements, actualNumberOfElements);
  }

  @ParameterizedTest
  @MethodSource("invalidAgeRanges")
  public void shouldCheckFilterByAgeWithInvalidInput(int minAge, int maxAge) {
    assertThrows(IllegalArgumentException.class, () -> manager.filterByAge(minAge, maxAge),
        "Age range can not be zero or negative number");
  }

  /**
   * Фильтрация по имени: 1) кейсы когда имена одинаковые, но передается с нижим регистром 2) с
   * верхним 3) Когда указана часть имени Azamat, Aza 4) кейс когда в списке только одна схожесть 5)
   * кейс когда несколько схожестей
   *
   */
  @ParameterizedTest
  @MethodSource("nameToFilter")
  public void shouldCheckFilterByNameWithValidName(String name, int expectedElements) {
    manager.addEntity(new User("Azamat", 18, true));
    manager.addEntity(new User("azamat", 30, true));
    manager.addEntity(new User("AZAMAT", 40, true));
    manager.addEntity(new User("azamaT", 29, true));
    manager.addEntity(new User("Aza", 41, true));
    int actualElements = manager.filterByName(name).size();
    assertEquals(expectedElements, actualElements);
  }

  @Test
  public void shouldCheckFilterByNameWhenNullProvided() {
    assertThrows(IllegalArgumentException.class, () -> manager.filterByName(null),
        "Argument can not be null");
  }

  /**
   * Проверить, что список с несколькими активными юзерами выводится 2) с одним активным юзером 3)
   * нет активных пользователей 4) нет неактивных пользователей 5) один неактивный 6) несколько
   * неактивных юзеров
   */
  @ParameterizedTest
  @MethodSource("filterByStatusArgument")
  public void shouldCheckStatusFilter(List<User> listOfUsers, boolean filterStatus,
      int expectedCountOfElements) {
    listOfUsers.forEach(manager::addEntity);
    int actualCountOfElements = manager.filterByStatus(filterStatus).size();
    assertEquals(expectedCountOfElements, actualCountOfElements);
  }


}
