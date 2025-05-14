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
    private int telefone; 
    
    public Paciente() {
}
    
    public Paciente(String nome, String cpf, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public Paciente(int id, String nome, String cpf, int telefone) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
        this.telefone = telefone;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}
