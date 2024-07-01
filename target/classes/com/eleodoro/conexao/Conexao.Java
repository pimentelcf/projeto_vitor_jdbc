package com.eleodoro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String url = "jdbc:mysql://localhost:3306/loja";
    private String user = "root";
    private String password = "";

    private Connection conn;

    public Connection getConexao() {

        try {

            if(conn == null) {
               conn = DriverManager.getConnection(url, user, password);
               System.out.println("Conexao com o banco de dados criado com sucesso")
               return conn;
            } else {
                System.out.println("Conexao com o banco de daods estavel")
                return conn;
            }
            }
            catch (SQLException e) {
                e.printlnSTackTrace();
                System.out.println("Erro na conexao com o banco de daods.")
                return null;

             }
    }

    public Connection

}