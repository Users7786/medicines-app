package kz.aitu.oop.practice.assignment4.Repository;

import kz.aitu.oop.practice.assignment4.connection_data_base.Postgres;
import kz.aitu.oop.practice.assignment4.entities.Employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Empl {


    private boolean createEMP(Employees emp) throws SQLException ,ClassNotFoundException {
        Empl empl = new Empl();
        Postgres conn = new Postgres();
        conn.getConnection();
        Connection connection = conn.getConnection();

            String sql = "INSERT INTO task2(name,surname,position , ) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1 , emp.getName());
            preparedStatement.setString(2 , emp.getSurname());
            preparedStatement.setString(3 , emp.getPosition());
            return true;
    }
}
