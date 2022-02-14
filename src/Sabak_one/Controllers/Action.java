package Sabak_one.Controllers;

import Sabak_one.DATA.Database_connection;

import java.sql.*;
import java.util.Scanner;

public class Action {

    public void Action_add()throws SQLException , ClassNotFoundException {
        Database_connection database_connection = new Database_connection();
        database_connection.Data_connconn();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Scanner scanner = new Scanner(System.in);
            connection = database_connection.Data_connconn();
            System.out.println("Add medicine ");

            String sql = "insert into TABLE_N(id , name,price,manufacturer , expiration_date) values (? ,? , ? , ? , ? )";
            preparedStatement = connection.prepareStatement(sql);
            System.out.println("  enter id = ");
            int id = scanner.nextInt();
            preparedStatement.setInt(1, id);
            System.out.println("  enter name = ");
            String name = scanner.next();
            preparedStatement.setString(2, name);
            System.out.println("  enter price");
            int price_set = scanner.nextInt();
            preparedStatement.setInt(3 , price_set);
            System.out.println("  enter manufacturer");
            String manufacturer = scanner.next();
            preparedStatement.setString(4 , manufacturer);
            System.out.println("  enter expiration_date");
            //Date date1 = Date.valueOf(scanner.next("01/01/2003"));
//          Date date = Date.valueOf(scanner.next("01/01/2003"));
            String date = scanner.next();
            preparedStatement.setString(5 , date);
            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }


    public void Action_get()throws SQLException , ClassNotFoundException {
        Database_connection database_connection = new Database_connection();
        database_connection.Data_connconn();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            ResultSet resultSet = null;
            Scanner scanner = new Scanner(System.in);
            connection = database_connection.Data_connconn();
            System.out.println("enter medicine id ");
            int id = scanner.nextInt();
            String sql = "Select * from TABLE_N where id = ' " + id + " '";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
                System.out.println(resultSet.getString("id") + " " + resultSet.getString("name")
                + " " + resultSet.getString("price") + " " + resultSet.getString("manufacturer")
                + " " + resultSet.getString("expiration_date")
                );

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
    public void Action_remove()throws SQLException , ClassNotFoundException {
        Database_connection database_connection = new Database_connection();
        database_connection.Data_connconn();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            ResultSet resultSet = null;
            Scanner scanner = new Scanner(System.in);
            connection = database_connection.Data_connconn();
            System.out.println("enter medicine id for delete ");
            int id = scanner.nextInt();
            String sql = "delete from TABLE_N where id = ' " + id + " '";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            System.out.println(" deleted");

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }

    public void Search()throws SQLException , ClassNotFoundException {
        Database_connection database_connection = new Database_connection();
        database_connection.Data_connconn();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            ResultSet resultSet = null;
            Scanner scanner = new Scanner(System.in);
            connection = database_connection.Data_connconn();
            System.out.println("enter medicine  ");
            String name1 = scanner.nextLine();
            String sql = "select *from TABLE_N where name LIKE  'a%'";
           // String sql = "select *from TABLE_N where name = ' " + name1 + " '";
            preparedStatement = connection.prepareStatement(sql);
           ResultSet resultSet1 = preparedStatement.executeQuery();
           if(resultSet1.next()){
               System.out.println(resultSet1.getString(1) + " " + resultSet1.getString(2) + " " + resultSet1.getString(3) + " " +resultSet1.getString(4) + resultSet1.getString(5)) ;
           }


        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
