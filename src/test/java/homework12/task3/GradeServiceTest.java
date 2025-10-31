package homework12.task3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class GradeServiceTest {

  GradeService<Integer> gradeService;
  int initialSize;

  public static Stream<Arguments> listWithGrades() {
    StudentGrade<Integer> student1 = new StudentGrade<>("Student1", "Math", 25);
    StudentGrade<Integer> student2 = new StudentGrade<>("Student2", "Math", 45);
    StudentGrade<Integer> student3 = new StudentGrade<>("Student3", "Math", 95);
    return Stream.of(
        Arguments.of(List.of(student1), 25),
        Arguments.of(List.of(student1, student2, student3), 55)
    );

  }

  /**
   * Добавление оценки: Положительная оценка, нулевая оценка и отрицательная - получаем ошибку
   * проверим что оценка добавилась увеличение 0 -> 1. Проверим получение средней арифметической
   * оценки по предмету: когда 0 оценок, из 1 оценки, из 3 оценок проверим. Проверим
   * потокобезопасность при добавлении оценок из нескольких потоков
   */
  @BeforeEach
  public void setup() {
    gradeService = new GradeService<>();
    initialSize = gradeService.gradeList.size();
  }

  @Test
  public void shouldReceiveErrorWhenNegativeGradeAdded() {
    assertThrows(InvalidGradeException.class,
        () -> gradeService.addGrade(new StudentGrade<>("Student1", "Math", -10)));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 80, 1000})
  public void shouldCheckAdditionOfGrade(int grade) {
    gradeService.addGrade(new StudentGrade<>("Student1", "Math", grade));
    int expectedSize = initialSize + 1;
    int actualSize = gradeService.gradeList.size();
    int actualGrade = gradeService.gradeList.getLast().getGrade();
    assertEquals(expectedSize, actualSize);
    assertEquals(grade, actualGrade);
  }

  @ParameterizedTest
  @MethodSource("listWithGrades")
  public void shouldCheckAverageGradeBySubject(List<StudentGrade<Integer>> listOfStudentGrades,
      double expectedAverage) {
    listOfStudentGrades.forEach(gradeService::addGrade);
    double actualAverage = gradeService.getAverageGradeBySubject("Math");
    assertEquals(expectedAverage, actualAverage);
  }

  @Test
  public void shouldThrowErrorWhenGetAverageWithNoGrades() {
    assertThrows(IllegalArgumentException.class,
        () -> gradeService.getAverageGradeBySubject("Physics"));
  }

}
