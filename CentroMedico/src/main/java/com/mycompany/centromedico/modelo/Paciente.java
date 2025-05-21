/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.modelo;

/**
 *
 * @author aluno.den
 */
public class Paciente {
    private int id; 
    private String nome; 
    private String cpf; 
    private String telefone; 
    private String relatorio;
    
    public Paciente() {
}

    public Paciente(int id, String nome, String cpf, String telefone, String relatorio) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.relatorio = relatorio;
    }

    public Paciente(String nome, String cpf, String telefone, String relatorio) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.relatorio = relatorio;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getrelatorio() {
        return relatorio;
    }

    public void setrelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return "Paciente" + "id: " + id + " nome " + nome + " cpf " + cpf + " telefone " + telefone + " relatorio " + relatorio;
    }
    
   

    
}
