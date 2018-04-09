package demo;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {

    private static final String URL = "jdbc:mysql:///?user=root&password=system";

    public static void main(String[] args) throws SQLException {
        new Driver();
        Connection connection = DriverManager.getConnection(URL);
        String sql = "insert into db.user value(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Tom");
        preparedStatement.setString(2, "123");
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
