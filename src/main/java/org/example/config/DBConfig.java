package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

        private static final Connection CONFIG;

        static {
            try {
                CONFIG = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres@shop", "postgres", "parham218");
            } catch (SQLException e) {
                throw new RuntimeException();
            }
        }

        public static Connection getConnection() {
            return CONFIG;
        }


}
