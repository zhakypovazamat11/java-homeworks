package homework5.task7;

public class AmusementPark {

  private Attraction attraction;

  public void setAttraction(Attraction attraction) {
    this.attraction = attraction;
  }

  public void maintainAttraction() {
    this.attraction.maintain();
  }

  public void printInfoExtremeAttraction() {
    if (this.attraction instanceof Extreme) {
      Extreme attraction = (Extreme) this.attraction;
      attraction.info();
    } else {
      System.out.println("Аттракцион не является экстремальным");
    }
  }

  public void printInfoModerateAttraction() {
    if (this.attraction instanceof Moderate) {
      Moderate attraction = (Moderate) this.attraction;
      attraction.info();
    } else {
      System.out.println("Аттракцион не является спокойным");
    }
  }


}
