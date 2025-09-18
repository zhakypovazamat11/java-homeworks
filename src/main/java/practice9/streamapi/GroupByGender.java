package practice9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGender {

  // Список строк с именами и полом "John:M", "Sarah:F"
  // Сгруппировать по полу в мап Map<String, List<String>>
  public static void main(String[] args) {
    List<String> names = Arrays.asList("John:M", "Sarah:F", "Sasha:F", "Ivan:M");
    Map<String, List<String>> groupedByGender = names.stream()
        .collect(Collectors.groupingBy(name -> name.split(":")[1],
            Collectors.mapping(name -> name.split(":")[0], Collectors.toList())));
    System.out.println(groupedByGender);
  }

}
