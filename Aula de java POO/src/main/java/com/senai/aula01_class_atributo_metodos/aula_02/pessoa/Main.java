package com.senai.aula01_class_atributo_metodos.aula_02.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Catanduva", 44, "Baeta Neves", "sbc", 192421);



        Pessoa pessoa1 = new Pessoa("Gustavo",17, endereco1);
        Pessoa pessoa2 = new Pessoa("Claudete",65, new Endereco("Piritiba", 87, "Hierofante", "Chique Chique", 145235));
        Pessoa pessoa3 = new Pessoa("Jucilene", 60, new Endereco("Piracicaba", 952, "Picuiba", "Beirinda", 512551));

        System.out.println(pessoa1.endereco.rua);

        pessoa1.Falar();

        Pessoa[] pessoas = new Pessoa[3];

        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;
        pessoas[2] = pessoa3;

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        ArrayList pessoasList = new ArrayList<>();

        pessoasList.add(pessoa1);
        pessoasList.add(pessoa2);
        pessoasList.add(pessoa3);
        pessoasList.add(new Pessoa("Judiana",51,endereco1));
        pessoasList.add("teste");
        pessoasList.add(512);
        pessoasList.add(true);

        System.out.println(pessoasList.get(5));
        pessoasList.remove(5);
        System.out.println(pessoasList.get(5));
        System.out.println(pessoasList.indexOf("teste"));


    }
}
