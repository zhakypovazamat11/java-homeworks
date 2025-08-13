package homework3;

public class GameSettings {

  static int maxPlayers;
  final String gameName;
  int currentPlayers;

  GameSettings(String gameName) {
    this.gameName = gameName;
  }

  public static void setMaxPlayers(int number) {
    maxPlayers = number;
  }

  public void addPlayer() {
    if (currentPlayers < maxPlayers) {
      currentPlayers++;
    } else {
      System.out.println("The number of allowed players is exceeded!");
    }
  }

  public void printGameStatus() {
    System.out.println(
        "Game name: " + this.gameName + " online players: " + this.currentPlayers + " max players: "
            + maxPlayers);
  }
}
