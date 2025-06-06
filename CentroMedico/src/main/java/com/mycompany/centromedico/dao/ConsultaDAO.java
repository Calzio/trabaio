/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.dao;

import com.mycompany.centromedico.conexao.ConexaoMySQL;
import com.mycompany.centromedico.modelo.Consulta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO {

    public void inserir(Consulta consulta) {
        String sql = "INSERT INTO consulta (id_paciente, id_medico, data, hora, observacao) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, consulta.getIdPaciente());
            stmt.setInt(2, consulta.getIdMedico());
            stmt.setString(3, consulta.getData().toString());
            stmt.setString(4, consulta.getHora().toString());
            stmt.setString(5, consulta.getObservacao());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir consulta: " + e.getMessage());
        }
    }

    public List<Consulta> listar() {
        List<Consulta> consultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Consulta consulta = new Consulta(
                    rs.getInt("id"),
                    rs.getInt("id_paciente"),
                    rs.getInt("id_medico"),
                    rs.getDate("data"),
                    rs.getTime("hora"),
                    rs.getString("observacao")
                );
                consultas.add(consulta);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar consultas: " + e.getMessage());
        }

        return consultas;
    }

    public List<Consulta> buscarPorPaciente(int idPaciente) {
        List<Consulta> consultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta WHERE id_paciente = ?";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPaciente);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Consulta consulta = new Consulta(
                    rs.getInt("id"),
                    rs.getInt("id_paciente"),
                    rs.getInt("id_medico"),
                    rs.getDate("data"),
                    rs.getTime("hora"),
                    rs.getString("observacao")
                );
                consultas.add(consulta);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar consultas por paciente: " + e.getMessage());
        }

        return consultas;
    }

    public List<Consulta> buscarPorData(String data) {
        List<Consulta> consultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta WHERE data = ?";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, data);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Consulta consulta = new Consulta(
                    rs.getInt("id"),
                    rs.getInt("id_paciente"),
                    rs.getInt("id_medico"),
                    rs.getDate("data"),
                    rs.getTime("hora"),
                    rs.getString("observacao")
                );
                consultas.add(consulta);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar consultas por data: " + e.getMessage());
        }

        return consultas;
    }

    public void atualizar(Consulta consulta) {
        String sql = "UPDATE consulta SET id_paciente = ?, id_medico = ?, data = ?, hora = ?, observacao = ? WHERE id = ?";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, consulta.getIdPaciente());
            stmt.setInt(2, consulta.getIdMedico());
            stmt.setString(3, consulta.getData().toString());
            stmt.setString(4, consulta.getHora().toString());
            stmt.setString(5, consulta.getObservacao());
            stmt.setInt(6, consulta.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar consulta: " + e.getMessage());
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM consulta WHERE id = ?";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao remover consulta: " + e.getMessage());
        }
    }
}