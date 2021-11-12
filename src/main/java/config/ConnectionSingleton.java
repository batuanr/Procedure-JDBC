package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/demo";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "12345abc";
    private static Connection connection;

    public static Connection getConnection (){
        if (connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
                System.out.println("tc");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                System.out.println("k");
            }
        }
        return connection;
    }
}
