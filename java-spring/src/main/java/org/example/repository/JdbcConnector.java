package org.example.repository;

import org.example.entity.Apple;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnector {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";

    private static final String SELECT_ALL = "SELECT * FROM apple_warehouse";

    public List<Apple> getAll() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
//            preparedStatement.setString(1, "Tesla");

//            Statement statement = connection.prepareStatement(SELECT_ALL);
//            ResultSet rs = statement.executeQuery(SELECT_BY_PRODUCER);

            ResultSet rs = preparedStatement.executeQuery();
            List<Apple> apples = new ArrayList<>();

            while (rs.next()) {
                Apple apple = new Apple(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4), rs.getDouble(5));
                apples.add(apple);
            }
            return apples;
        }
    }
}