package com.senai.aula01_class_atributo_metodos.aula_01.carro;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro("honda","creeze","verde",2012,1.7,(byte)4,90555);
        System.out.println(carro1);


        carro1.verificarInformacoes();
        carro1.ligarCarro();
        carro1.testarSom();
        carro1.buzinar();
        carro1.consultarPreco(2024);

        Carro carro2 = new Carro("fiat","fit","amarelo",2013,1.9,(byte)4,190555);
        System.out.println(carro2);

        carro2.verificarInformacoes();
        carro2.ligarCarro();
        carro2.testarSom();
        carro2.buzinar();
        carro2.consultarPreco(2048);

        Carro carro3 = new Carro("hyundai","hb20","azul",2018,3.9,(byte)4,76455);
        System.out.println(carro3);

        carro3.verificarInformacoes();
        carro3.ligarCarro();
        carro3.testarSom();
        carro3.buzinar();
        carro3.consultarPreco(2048);

        carro1 = carro2;
        System.out.println(carro1);
        System.out.println(carro2);


        System.out.println(carro2.modelo);

        String texto = "teste";
        System.out.println(texto);

        System.out.println(carro2.equals(carro3));
    }
}

