package homework12.task4;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MovieService<T extends Number> {

  private final ConcurrentHashMap<Movie, List<Rating<T>>> service = new ConcurrentHashMap<>();

  public void addRating(Movie movie, Rating<T> rating) {
    if (rating.getRate().doubleValue() < 1 || rating.getRate().doubleValue() > 10) {
      throw new IllegalArgumentException("Rate number can not be less or greater than 1 - 10!");
    }
    service.computeIfAbsent(movie, k -> new ArrayList<>()).add(rating);
  }

  public double getAverageByMovie(Movie movie) {
    List<Rating<T>> movieRatings = service.get(movie);
    if (movieRatings == null || movieRatings.isEmpty()) {
      throw new IllegalArgumentException("Rating list of Movie is Empty");
    }
    return movieRatings.stream().mapToDouble((rate) -> rate.getRate().doubleValue()).average()
        .orElse(0);
  }

  public List<Movie> getSortedMoviesByRating() {
    return service.entrySet().stream().filter(e -> !e.getValue().isEmpty())
        .sorted((e1, e2) -> Double
            .compare(average(e2.getValue()), average(e1.getValue()))).map(Map.Entry::getKey)
        .collect(Collectors.toList());
  }

  private double average(List<Rating<T>> ratings) {
    return ratings.stream().mapToDouble((rate) -> rate.getRate().doubleValue()).average()
        .orElse(0);
  }
}


