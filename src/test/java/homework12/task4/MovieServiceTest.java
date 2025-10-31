package homework12.task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MovieServiceTest {

  /**
   * Тесты по добавлению оценки: негативный сценарий, добавить 0.9, 10.1, null. Положительные кейсы:
   * 1, 10. Тесты для расчета среднего значения, когда лист оценок пустой, когда лист оценок из 1
   * числа 0, когда лист из оценок из нескольких с разными числами. Тесты для сортировки по
   * убыванию: положительный кейс,
   *
   */
  MovieService<Double> service;
  Movie movie;

  @BeforeEach
  public void setup() {
    service = new MovieService<>();
    movie = new Movie("Avengers");
  }

  @ParameterizedTest
  @ValueSource(doubles = {0.9, 10.1})
  public void shouldThrowExceptionWhenProvidedInvalidRate(double rate) {
    assertThrows(IllegalArgumentException.class,
        () -> service.addRating(movie, new Rating<>(rate)));
  }

  @Test
  public void shouldAddAndGetAverageRatingWhenValidRateProvided() {
    double expectedValueOfAverage = 5.5;
    service.addRating(movie, new Rating<>(1.0));
    service.addRating(movie, new Rating<>(10.0));
    assertEquals(expectedValueOfAverage, service.getAverageByMovie(movie));
  }

  @Test
  public void shouldThrowExceptionWhenNullProvided() {
    assertThrows(IllegalArgumentException.class, () -> service.addRating(null,
        new Rating<>(0.0)));
  }

  @Test
  public void shouldThrowExceptionWhenGettingAverageOfEmptyList() {
    assertThrows(IllegalArgumentException.class, () -> service.getAverageByMovie(movie));
  }

  @Test
  public void shouldGetAverageWhenOnlyOneRateWasProvided() {
    double expectedAverage = 1;
    service.addRating(movie, new Rating<>(1.0));
    assertEquals(expectedAverage, service.getAverageByMovie(movie));
  }

  @Test
  public void shouldSortByAverageOrderedByDesc() {
    Movie movie2 = new Movie("SpiderMan");
    service.addRating(movie, new Rating<>(1.0));
    service.addRating(movie, new Rating<>(10.0));
    service.addRating(movie2, new Rating<>(10.0));
    List<Movie> expectedList = List.of(movie2, movie);
    assertEquals(expectedList, service.getSortedMoviesByRating());
  }


}
