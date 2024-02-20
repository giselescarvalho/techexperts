package tech;

import java.util.Scanner;

public class ContaTest {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

    //    String cliente, endereco;
    //    Scanner cliente = new Scanner();
    //    p1.nome = cliente;
        p1.nome = "Jão";
        p1.cpf = 436;
        p1.endereco = "Rua dos Rubis";
        p1.telefone = "1140028922";

        Conta c1 = new Conta();
        c1.senha = 1234;
        c1.saldoconta = 1.00;


        c1.deposita(50);
        System.out.println("deposito feito, saldo atual: " + c1.saldoconta);

        c1.saca(20);
        System.out.println("saque feito, saldo atual: "+c1.saldoconta);


    }


}
