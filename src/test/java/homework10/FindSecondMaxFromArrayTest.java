package homework10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FindSecondMaxFromArrayTest extends HomeworkTaskFunctionsTest {

  public static Stream<Arguments> correctArrayWithNumbers() {
    return Stream.of(
        Arguments.of(new int[]{3, 5, 7, 2}, 5),
        Arguments.of(new int[]{-4, -5, -7}, -5),
        Arguments.of(new int[]{1, 1, 1, 1}, 1),
        Arguments.of(new int[]{1, 1, 0, 1}, 0)
    );
  }


  @ParameterizedTest
  @MethodSource("correctArrayWithNumbers")
  public void userCanReturnSecondMaxElementFromCorrectArray(int[] inputArray, int secondMax) {
    int actualResult = hwMethods.findSecondMax(inputArray);
    assertEquals(secondMax, actualResult);
  }

  @Test
  public void userCanNotReturnSecondMaxElementFromEmptyArray() {
    assertThrows(IllegalArgumentException.class, () -> hwMethods.findSecondMax(new int[]{}),
        "Can not find second max element from empty array");
  }

  @Test
  public void userCanNotReturnSecondMaxElementFromArrayWithOneElement() {
    assertThrows(IllegalArgumentException.class, () -> hwMethods.findSecondMax(new int[]{1}),
        "Can not find second max element from array with one element");
  }

}
