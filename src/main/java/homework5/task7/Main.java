package homework5.task7;

public class Main {

  public static void main(String[] args) {
    AmusementPark park = new AmusementPark();
//    Attraction attraction = new RollerCoaster();
//    park.setAttraction(attraction);
//    park.maintainAttraction();
//    park.printInfoModerateAttraction();
//    park.printInfoExtremeAttraction();
    Attraction attraction = new Carousel();
    park.setAttraction(attraction);
    park.maintainAttraction();
    park.printInfoModerateAttraction();
    park.printInfoExtremeAttraction();

  }

}
