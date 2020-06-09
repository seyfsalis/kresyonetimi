package util;



import java.sql.*;

public abstract class DBConnection {

    public Connection connect() throws SQLException {

        Connection connection = null;
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kresyonetim", "root", "root");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return connection;
    }

}
