package kz.aitu.oop.practice.assignment4.connection_data_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Postgres {


    public Connection getConnection() throws SQLException , ClassNotFoundException
    {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        try {
            Connection conn = DriverManager.getConnection(url , "postgre" , "root");
            return conn;
        }
        catch (Exception E){
            E.printStackTrace();
            return null;
        }
    }
}
