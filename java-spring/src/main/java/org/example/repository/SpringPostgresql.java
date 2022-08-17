package org.example.repository;

import org.springframework.boot.CommandLineRunner;

public class SpringPostgresql  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

    }

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "docker";

    private static final String SELECT_ALL = "SELECT * FROM apple_warehouse";
}
