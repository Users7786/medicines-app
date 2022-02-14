package kz.aitu.oop.practice.assignment4.COMMAND;

import SABAK.JDBS_CON;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class COMMAND {

    public void visov()throws SQLException , ClassNotFoundException{
        JDBS_CON CON = new JDBS_CON();
        CON.getConnection();
        Connection connection = CON.getConnection();
    }



    public void Command()throws ClassNotFoundException , SQLException {
        Scanner scanner = new Scanner(System.in);
        JDBS_CON CON = new JDBS_CON();
        CON.getConnection();
        Connection connection = CON.getConnection();

        try{
            int id = scanner.nextInt();
            PreparedStatement preparedStatement = connection.prepareStatement("Select * from task where id = ' " + id + " '");
            //preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + resultSet.getString(3) + resultSet.getString(4));
            }
            else if(!resultSet.next()){
                System.err.println("not found");
            }
            else{
                System.err.println(" wrong ");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


    public void ID() throws ClassNotFoundException , SQLException{
        Scanner scanner = new Scanner(System.in);
        JDBS_CON JD = new JDBS_CON();
        Connection connection = JD.getConnection();

    }
}
