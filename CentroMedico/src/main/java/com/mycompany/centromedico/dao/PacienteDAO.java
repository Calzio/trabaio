/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.dao;

import com.mycompany.centromedico.conexao.ConexaoMySQL;
import com.mycompany.centromedico.modelo.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    public void inserir(Paciente paciente) {
        String sql = "INSERT INTO paciente (nome, cpf, telefone) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getTelefone());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Paciente> listar() {
        List<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setTelefone(rs.getString("telefone"));
                lista.add(paciente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public Paciente buscarPorId(int id) {
        String sql = "SELECT * FROM paciente WHERE id = ?";
        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setTelefone(rs.getString("telefone"));
                return paciente;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void deletar(int id) {
        String sql = "DELETE FROM paciente WHERE id = ?";
        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

