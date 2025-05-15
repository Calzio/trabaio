/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.dao;

import com.mycompany.centromedico.conexao.ConexaoMySQL;
import com.mycompany.centromedico.modelo.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    public void inserir(Medico medico) {
        String sql = "INSERT INTO medico (nome, especialidade, crm) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getEspec());
            stmt.setString(3, medico.getCrm());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Medico> listar() {
        List<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM medico";

        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Medico medico = new Medico();
                medico.setId(rs.getInt("id"));
                medico.setNome(rs.getString("nome"));
                medico.setEspec(rs.getString("especialidade"));
                medico.setCrm(rs.getString("crm"));
                lista.add(medico);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public Medico buscarPorId(int id) {
        String sql = "SELECT * FROM medico WHERE id = ?";
        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Medico medico = new Medico();
                medico.setId(rs.getInt("id"));
                medico.setNome(rs.getString("nome"));
                medico.setEspec(rs.getString("especialidade"));
                medico.setCrm(rs.getString("crm"));
                return medico;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void deletar(int id) {
        String sql = "DELETE FROM medico WHERE id = ?";
        try (Connection conn = ConexaoMySQL.getConexaoMySQL();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
