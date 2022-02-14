package Sabak_one.Controllers;

import Sabak_one.DATA.Database_connection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableJdbc {

    public void CreateTable()throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        Database_connection database_connection = new Database_connection();
        connection = database_connection.Data_connconn();

        try {
            System.out.println("Creating table in selected database...");
            statement = connection.createStatement();

            String SQL = "CREATE TABLE TABLE_ " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(50), " +
                    " price INTEGER not NULL, " +
                    " manufacturer varchar (50) ,"+
                    " expiration_date varchar (50), " +
                    " PRIMARY KEY (id))";

            statement.executeUpdate(SQL);
    }finally {
            if (statement != null) {
                statement.close();
            }
        }
}
    }
