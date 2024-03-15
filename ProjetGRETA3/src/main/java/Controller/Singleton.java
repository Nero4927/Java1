package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
    private static Singleton instance;
    private Connection connection;

    private Singleton() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetgreta", "root", "");
            System.out.println("Connexion réussie!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erreur lors de la création de la connexion : " + e.getMessage());
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
