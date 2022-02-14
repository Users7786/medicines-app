package Sabak_one.DATA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_connection {

    public Connection Data_connconn() throws SQLException , ClassNotFoundException {

        final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String Postgresql_Password = "root";
        final String Postgresql_User = "postgres";
        try {
            Connection connection = null ;
            Statement statement = null;
            connection = DriverManager.getConnection(DATABASE_URL , Postgresql_User , Postgresql_Password);
            return connection;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
