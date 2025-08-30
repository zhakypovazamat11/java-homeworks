package practice7.user_monitor;

public class Main {

  public static void main(String[] args) {
    UserMonitor users = new UserMonitor();
    users.addSession("143.4");
    users.addSession("143.4");
    users.addSession("156.7");
    users.addSession("143.4");
    users.addSession("143.5");
    users.addSession("143.6");
    users.addSession("143.6");
    users.addSession("143.6");
    users.addSession("143.6");
    users.printSessions();
  }
}
