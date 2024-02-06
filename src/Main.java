import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
         String conString = "jdbc:postgresql://localhost:5432/simpledb";
         Connection con = null;
         Statement statement = null;
         ResultSet rs = null;
         try {
             con = DriverManager.getConnection(conString, "postgres", "231608");
             statement = con.createStatement();
             rs = statement.executeQuery("SELECT name, surname, age, gender, course FROM users");
         } catch (SQLException e) {
             System.out.println("connection error: " + e.getMessage());
         }
        }
    }
