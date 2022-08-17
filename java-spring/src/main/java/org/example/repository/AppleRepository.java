package org.example.repository;

import org.example.entity.Apple;

import java.sql.SQLException;
import java.util.List;

//@Repository
public class AppleRepository {
    JdbcConnector connector;

    public AppleRepository(JdbcConnector connector) {
        this.connector = connector;
    }

    public List<Apple> getAll() {
        try {
            return connector.getAll();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}