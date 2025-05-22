/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/centro_medico";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection getConexaoMySQL() throws SQLException {
    return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cadastro", "usuario", "senha"
            );
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco de dados", e);
        }
    }

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


