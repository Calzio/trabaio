/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.controle;

import com.mycompany.centromedico.dao.PacienteDAO;
import com.mycompany.centromedico.modelo.Paciente;
import com.mycompany.centromedico.dao.PacienteDAO;
import com.mycompany.centromedico.modelo.Paciente;
import java.util.List;
/**
 *
 * @author aluno.den
 */
public class PacienteControle {
     private PacienteDAO pacienteDAO = new PacienteDAO();

    public void adicionarPaciente(String nome, String cpf, String telefone, String relarotio) {
        Paciente paciente = new Paciente(0, nome, cpf, telefone, relarotio);
        pacienteDAO.inserir(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacienteDAO.listar();
    }

    public void atualizarPaciente(Paciente paciente) {
        pacienteDAO.atualizar(paciente);
    }

    public void removerPaciente(int id) {
        pacienteDAO.remover(id);
    } 
}
