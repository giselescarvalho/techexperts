package tech;

import Pessoa.java;

public class ContaTest {


    public static void main(String[] args) {

        Conta p1 = new Conta();
        p1.nome = "jao";
        p1.cpf = 436;
        p1.endereco = "Rua graciosa";

        var p2 = new Conta();
        p2.nome = "";
        p1.cpf = 386;
        p2.endereco = "Rua graciosa";

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }


}
