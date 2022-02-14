package Sabak_one;

import Sabak_one.repositories.Menu;
import Sabak_one.DATA.Database_connection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        CreateTableJdbc createTableJdbc = new CreateTableJdbc();
//        createTableJdbc.CreateTable();
        Database_connection database_connection = new Database_connection();
        database_connection.Data_connconn();
        Menu menu = new Menu();
        menu.Show_mnu();
//        Action action = new Action();
//        action.Action_do();


    }
}
