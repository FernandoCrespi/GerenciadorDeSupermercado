package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {

    private static final String URL = "jdbc:mysql://localhost:3306/GerenciadorMercado";
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
