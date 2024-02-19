package tech;

import java.util.Random;

public class Conta {

    public String nome;
    public int cpf;
    public String endereco;
    public String telefone;
    public int senha;
    public double saldoconta = 0.00;

    public void criaAgCc(){
        //System.out.println(Math.floor(Math.random()*1000));
        Random agencia = new Random();
        Random conta = new Random();

        System.out.println("Seu número de Agência é: "+agencia.nextInt(9999+1) + "\nSua Conta Corrente é:    "+ conta.nextInt(99999+1));

    }
}
