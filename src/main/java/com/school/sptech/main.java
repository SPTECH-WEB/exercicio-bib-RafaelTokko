package com.school.sptech;

public class main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Central", 2.5);
        Biblioteca b2 = new Biblioteca("Bairro", 1.5);

        b1.registrarLivro(10);
        System.out.println(b1.getQtdLivros());

        b1.emprestar(4);
        System.out.println(b1.getQtdLivros());

        b1.transferir(b2, 3);
        System.out.println(b1.getQtdLivros());
        System.out.println(b2.getQtdLivros());

        b1.reajustarMulta(0.10);
        System.out.println(b1.getMultaDiaria());

    }
}
