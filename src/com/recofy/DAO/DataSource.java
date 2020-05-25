package com.recofy.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private String hostname;
    private String username;
    private String password;
    private String database;
    private Connection connection;

    public DataSource () {
        try {
            hostname = "localhost";
            database = "recofy";
            username = "temreco";
            password = "123456";
            String URL = "jdbc:mysql://"+hostname+":3306/"+database+"?useTimezone=true&serverTimezone=UTC";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Conectou o DS");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
