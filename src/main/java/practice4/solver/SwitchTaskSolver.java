package practice4.solver;

import practice4.Season;

public class SwitchTaskSolver {

  public String dayOfWeek(int day) {
    String dayOfWeek = "";
    switch (day) {
      case 1:
        dayOfWeek = "Понедельник";
        break;
      case 2:
        dayOfWeek = "Вторник";
        break;
      case 3:
        dayOfWeek = "Среда";
        break;
      case 4:
        dayOfWeek = "Четверг";
        break;
      case 5:
        dayOfWeek = "Пятница";
        break;
      case 6:
        dayOfWeek = "Суббота";
        break;
      case 7:
        dayOfWeek = "Воскресенье";
        break;
      default:
        dayOfWeek = "Несуществующий день недели";
    }

    return dayOfWeek;
  }

  public String describeSeason(Season season) {
    String description = "";
    switch (season) {
      case WINTER -> description = "Зима - Холодно и снежно";
      case SUMMER -> description = "Лето - жарко";
      case SPRING -> description = "Весна - все цветет";
      case AUTUMN -> description = "Осень - дожди";
    }

    return description;
  }
}
