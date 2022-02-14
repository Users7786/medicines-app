package SABAK;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBS_CON con = new JDBS_CON();
        con.getConnection();
        Term term = new Term();
        term.SHOW();
    }
}
