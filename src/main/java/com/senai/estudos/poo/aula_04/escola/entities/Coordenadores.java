package com.senai.estudos.poo.aula_04.escola.entities;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionario{
    private List<Professores> listaDeprofessores = new ArrayList<>();

    public Coordenadores(String nome, double salario, List<Professores> listaDeprofessores) {
        super(nome, salario);
        this.listaDeprofessores = listaDeprofessores;
    }

    public List<Professores> getListaDeprofessores() {
        return listaDeprofessores;
    }

    public void setListaDeprofessores(List<Professores> listaDeprofessores) {
        this.listaDeprofessores = listaDeprofessores;
    }

    @Override
    public String toString() {
        return "Nome: "+super.getNome()+"\nSalario: "+super.getSalario()+"\nEquipe de professores: "+listaDeprofessores.stream().toString();
    }
}
