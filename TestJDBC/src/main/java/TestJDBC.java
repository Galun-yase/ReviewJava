import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author i-renchen@shuwen.com
 * @date 2021/6/8 20:21
 */
public class TestJDBC {

    public static String JDBC_URL = "jdbc:mysql://120.55.91.42:3306/fivesix";
    public static String JDBC_USER = "root";
    public static String JDBC_PASSWORD = "cc..2233";


    public static DataSource createConnectionByPool(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(JDBC_USER);
        config.setPassword(JDBC_PASSWORD);

        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }
    
    public static Connection createConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        return connection;
    }

    public static void main(String[] args) throws SQLException {

        //Connection connection = TestJDBC.createConnection();

        Connection conn = TestJDBC.createConnectionByPool().getConnection();

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from categories");
        while (resultSet.next()){
            String string = resultSet.getString(2);
            System.out.println(string);
        }

        resultSet.close();
        statement.close();
        conn.close();


    }

}
