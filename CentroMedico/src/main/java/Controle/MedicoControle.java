/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import com.mycompany.centromedico.dao.MedicoDAO;
import com.mycompany.centromedico.modelo.Medico;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno.den
 */
public class MedicoControle {
      private MedicoDAO medicoDAO = new MedicoDAO();

    public void adicionarMedico(String nome, String especialidade, String crm) {
        Medico medico = new Medico(nome, especialidade, crm);
        medicoDAO.inserir(medico);
    }

    public List<Medico> listarMedicos() {
        return medicoDAO.listar();
    }

    public void atualizarMedico(Medico medico) {
        medicoDAO.atualizar(medico);
    }

    public void removerMedico(int id) {
        medicoDAO.remover(id);
    }

    public ArrayList<Medico> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cadastrar(String nome, String especie, int idade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
