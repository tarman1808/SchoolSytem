package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteHelper {

    private static final String SQLITECONN = "jdbc:sqlite:database.sqlite";

    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQLITECONN);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
