package practice8.exceptions.checked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionExample {

  public static void main(String[] args) {
    Connection cnt = null;
    try {
      cnt = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "user", "password");
      Statement stmt = cnt.createStatement();
      ResultSet resultSet = stmt.executeQuery("SELECT * FROM users");

      while (resultSet.next()) {
        System.out.println("User: " + resultSet.getString("userName"));
      }

    } catch (SQLException e) {
      System.err.println("SQL Error: " + e.getMessage());
    } finally {
      try {
        if (cnt != null) {
          cnt.close();
        }
      } catch (SQLException e) {
        System.err.println("Error Closing Connection: " + e.getMessage());
      }
    }
  }
}