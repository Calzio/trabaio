/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.controle;

import com.mycompany.centromedico.dao.ConsultaDAO;
import com.mycompany.centromedico.modelo.Consulta;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author aluno.den
 */
public class ConsultaControle {
    private ConsultaDAO consultaDAO = new ConsultaDAO();

    public void agendarConsulta(int idPaciente, int idMedico, Date data, Time hora, String observacao) {
        Consulta consulta = new Consulta(0, idPaciente, idMedico, data, hora, observacao);
        consultaDAO.inserir(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultaDAO.listar();
    }

    public List<Consulta> buscarPorPaciente(int idPaciente) {
        return consultaDAO.buscarPorPaciente(idPaciente);
    }

    public List<Consulta> buscarPorData(String data) {
        return consultaDAO.buscarPorData(data);
    }

    public void atualizarConsulta(Consulta consulta) {
        consultaDAO.atualizar(consulta);
    }

    public void cancelarConsulta(int id) {
        consultaDAO.remover(id);
    }
}
