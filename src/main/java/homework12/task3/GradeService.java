package homework12.task3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {

  List<StudentGrade<T>> gradeList = new ArrayList<>();

  public synchronized void addGrade(StudentGrade<T> grade) {
    if (grade.getGrade().doubleValue() < 0) {
      throw new InvalidGradeException("Grade can not be negative");
    }
    gradeList.add(grade);
  }

  public synchronized double getAverageGradeBySubject(String subject) {
    return gradeList.stream().filter(studentGrade -> studentGrade.getSubject()
            .equals(subject)).mapToDouble(grade -> grade.getGrade().doubleValue()).average()
        .orElseThrow(() -> new
            IllegalArgumentException("Нет оценок по предмету: " + subject));
  }
}
