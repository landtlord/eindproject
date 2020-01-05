package be.hogent.eindproject.model.repositories;

import be.hogent.eindproject.model.Order;

import java.nio.channels.NoConnectionPendingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {
    private Connection repoConnection;

    public Repository() {
        makeJDBCConnection();
    }

    private void makeJDBCConnection() {
        try {
            repoConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "order", "AQWzsxedc1.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new NoConnectionPendingException();
        }
    }

}
