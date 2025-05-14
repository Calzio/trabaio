/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centromedico.modelo;

/**
 *
 * @author aluno.den
 */
public class Medico {
    private int id;
    private String nome;
    private String espec;
    private String crm;

    public Medico() {
    
}
    public Medico(String nome, String espec, String crm){
        this.nome = nome;
        this.espec = espec;
        this.crm = crm;
    }
    
    public Medico(int id, String nome, String espec, String crm){
        this.id = id;
        this.nome = nome;
        this.espec = espec;
        this.crm = crm;
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

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
}
