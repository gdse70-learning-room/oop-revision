import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysq.cj.jdbc.Driver");

            try(Connection connection = DriverManager.getConnection("" +
                            "jdbc:mysql://localhost:3306/kade",
                    "root",
                    "Ijse@1234"
            )) {
                Statement statement = connection.createStatement();
                statement
                        .executeUpdate
                                ("INSERT INTO customers VALUES('')");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
