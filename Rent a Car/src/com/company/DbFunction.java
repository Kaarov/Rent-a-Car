package com.company;

import java.sql.*;

public class DbFunction {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname, user, pass);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }

    public Boolean login_director(Connection connection, String user, String password) {
        Statement statement;
        ResultSet result = null;
        try {
            String query = String.format("SELECT * FROM person WHERE name = '%s' AND password = '%s'", user, password);
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void get_cars(Connection connection) {
        Statement statement;
        ResultSet result = null;
        try {
            String query = String.format("SELECT * FROM cars");
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            System.out.println("-----------------------");
            while (result.next()) {
                System.out.println();
                System.out.println(result.getString("id") + " auto");
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Brand: " + result.getString("brand"));
                System.out.println("Price: " + result.getString("price"));
                System.out.println("Body Type: " + result.getString("body_type"));
                System.out.println("Auto/Manual: " + result.getString("auto_manual"));
                System.out.println("In rent: " + result.getString("rent"));
                System.out.println("In service: " + result.getString("service"));
                System.out.println("Status: " + result.getString("status") + ".");
                System.out.println();
                System.out.println("-----------------------");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert_cars(Connection connection, String name, int price, String body_type, String auto_manual, String brand) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO cars (name, price, body_type, auto_manual, brand)" +
                    " VALUES ('%s', %s, '%s', '%s', '%s');", name, price, body_type, auto_manual, brand);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Успешно добавлено!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read(Connection connection, String table_name) {
        Statement statement;
        ResultSet result = null;
        try {
            String query = String.format("SELECT * FROM %s", table_name);
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getString("name") + " " + result.getString("password"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}