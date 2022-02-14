package kz.aitu.oop.practice.assignment4.entities;

import kz.aitu.oop.practice.assignment4.connection_data_base.Postgres;

import java.sql.Connection;
import java.sql.SQLException;

public class Client extends Employees{

    public Client(){
        super();
    }

    public void CreateCli()throws SQLException , ClassNotFoundException {

        Postgres postgres = new Postgres();
        Connection connection = postgres.getConnection();


    }
}
