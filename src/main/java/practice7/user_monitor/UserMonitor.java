package practice7.user_monitor;

import java.util.HashSet;

public class UserMonitor {

  private HashSet<String> sessions;

  public UserMonitor() {
    this.sessions = new HashSet<>();
  }

  public void addSession(String session) {
    sessions.add(session);
  }

  public HashSet<String> getSessions() {
    return sessions;
  }

  public void printSessions() {
    System.out.println("Все уникальные сессии");
    sessions.forEach(System.out::println);
  }
}
