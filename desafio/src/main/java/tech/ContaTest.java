package tech;

import java.util.Scanner;

public class ContaTest {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

    //    String cliente, endereco;
    //    Scanner cliente = new Scanner();
    //    p1.nome = cliente;
        p1.getNome();
        p1.getCpf();
        p1.getCpf();
        p1.getTelefone();

        Conta c1 = new Conta(1234);
   //     c1.getSenha();
        c1.getSaldoconta();


        c1.deposita(50);
        System.out.println("deposito feito, saldo atual: " + c1.getSaldoconta());

        c1.saca(20);
        System.out.println("saque feito, saldo atual: "+c1.getSaldoconta());


    }


}
