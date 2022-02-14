package SABAK;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Option {

    public Option(){}

    public void con() throws SQLException , ClassNotFoundException{
        Scanner scanner = new Scanner(System.in);
        JDBS_CON CON = new JDBS_CON();
        CON.getConnection();
        Connection connection = CON.getConnection();
    }
    public void Search() throws SQLException , ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        JDBS_CON CON = new JDBS_CON();
        CON.getConnection();
        Connection connection = CON.getConnection();
        try {
            System.out.println(" name ");
            scanner.nextLine();
            String name = scanner.nextLine();
            PreparedStatement prepareStatement = connection.prepareStatement("Select * from task2 where name='" + name + "'");
            ResultSet resultSet = prepareStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println(resultSet.getString("id") + resultSet.getString("name") + " " + resultSet.getString(" price ") + resultSet.getString(" LocalDate ") + " " + resultSet.getString(" manufacturer "));
            } else if (!resultSet.next()) {
                System.out.println(" the drug was not found  !! ");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void Add_medicine(){

    }
}
