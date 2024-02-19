package tech;

import Pessoa.java;

public class PessoaTest {


    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "jao";
        p1.cpf = 436;
        p1.endereco = "Rua graciosa";

        var p2 = new Pessoa();
        p2.nome = "";
        p1.cpf = 386;
        p2.endereco = "Rua graciosa";

        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }


}
