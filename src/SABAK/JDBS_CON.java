package SABAK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBS_CON {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String URL = "jdbc:postgresql://localhost:5432/postgres";
        String url = "jdbc:postgresql://localhost:5432/postgres";
//        String PASSWORD = "root";
//        String USER = "postgres";
        try {
            Connection connection = DriverManager.getConnection(url , "postgres" , "root");
            return connection;
        }
        catch (Exception E){
            E.printStackTrace();
            System.out.println(E);
            return null;
        }

    }

    public void nePis() throws ClassNotFoundException , SQLException{

        Scanner scanner = new Scanner(System.in);
        JDBS_CON CON = new JDBS_CON();

        CON.getConnection();
        Connection connection = CON.getConnection();
    }
}
